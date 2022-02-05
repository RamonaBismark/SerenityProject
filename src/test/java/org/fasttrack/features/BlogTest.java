package org.fasttrack.features;

import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrack.utils.EnvConstants;
import org.junit.Test;

public class BlogTest extends BaseTest {

    @Test
    public void leaveAReplyTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        blogSteps.clickOnBlog();
        blogSteps.writeComment("Hello. Congratulations!!!" + RandomStringUtils.randomAlphabetic(10));
        blogSteps.clickOnPostComment();
        blogSteps.checkCommentPostedMessage("Your comment is awaiting moderation.");
    }

    @Test
    public void leaveTheSameReplyForTheSecondTimeTest(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASSWORD);
        blogSteps.clickOnBlog();
        String comment = "Hello. Congratulations!!!" + RandomStringUtils.randomAlphabetic(10);
        blogSteps.writeComment(comment);
        blogSteps.clickOnPostComment();
        blogSteps.writeComment(comment);
        blogSteps.clickOnPostComment();
        blogSteps.checkErrorMessageDuplicateReview("Duplicate comment detected; it looks as though you’ve already said that!");
    }


}
