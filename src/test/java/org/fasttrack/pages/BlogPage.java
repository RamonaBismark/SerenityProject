package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class BlogPage extends BasePage {

    @FindBy(id = "menu-item-1643")
    private WebElementFacade blogButton;

    @FindBy(css = ".comment-form-comment #comment")
    private WebElementFacade commentField;

    @FindBy(id = "submit")
    private WebElementFacade postCommentButton;

    @FindBy(css = ".comment-list")
    private WebElementFacade commentSuccessfulPosted;

    @FindBy(css = "body#error-page")
    private WebElementFacade errorDuplicateReview;


    public void clickBlogButton() {
        clickOn(blogButton);
    }

    public void leaveComment(String comment) {
        typeInto(commentField, comment);
    }

    public void clickPostCommentButton() {
        clickOn(postCommentButton);
    }

    public void checkCommentSuccessfulPosted(String message) {
        commentSuccessfulPosted.shouldContainText(message);
    }

    public void checkCommentErrorDuplicateReview(String message) {
        errorDuplicateReview.shouldContainText(message);
    }


}
