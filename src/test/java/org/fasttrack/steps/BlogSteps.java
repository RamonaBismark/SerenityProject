package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

public class BlogSteps extends BaseSteps{

    @Step
    public void clickOnBlog(){
        blogPage.clickBlogButton();
    }

    @Step
    public void writeComment (String comment){
        blogPage.leaveComment(comment);
    }

    @Step
    public void clickOnPostComment(){
        blogPage.clickPostCommentButton();
    }

    @Step
    public void checkCommentPostedMessage(String message){
        blogPage.checkCommentSuccessfulPosted(message);
    }

    @Step
    public void checkErrorMessageDuplicateReview(String message){
        blogPage.checkCommentErrorDuplicateReview(message);
    }
}
