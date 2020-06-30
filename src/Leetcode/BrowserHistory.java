package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    int currentPage = 0;
    private List<String> visitedURL = new ArrayList<>();

    public BrowserHistory(String homepage) {
        visitedURL.add(null);
        visitedURL.add(homepage);
        currentPage++;
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode");
        browserHistory.visit("google");
        browserHistory.visit("Facebook");
        browserHistory.visit("utube");
        browserHistory.back(1);
        browserHistory.back(1);
        browserHistory.forward(1);
        browserHistory.visit("linkedIn");
        browserHistory.forward(1);
        browserHistory.back(2);
        browserHistory.back(2);
        browserHistory.back(7);

    }

    public void visit(String url) {
        visitedURL.add(url);
        currentPage++;

    }

    public String back(int steps) {
        if (steps >= visitedURL.size() - 1) {
            System.out.println(visitedURL.get(1));
            return visitedURL.get(1);
        } else {
            currentPage = currentPage - steps;
            System.out.println(visitedURL.get(currentPage) + " " + currentPage);
            return visitedURL.get(currentPage);
        }
    }

    public String forward(int steps) {

        if (currentPage + steps >= visitedURL.size()) {
            System.out.println(visitedURL.get(visitedURL.size() - 1));
            return visitedURL.get(visitedURL.size() - 1);
        } else {
            currentPage = currentPage + steps;
            System.out.println(currentPage + " " + visitedURL.get(currentPage));
            return visitedURL.get(currentPage);
        }

    }
}
