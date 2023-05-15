package com.website.StcTV;

import com.website.BasePage.BasePage;
import com.website.StcTV.pages.*;

public class STcTVWebsite extends BasePage {

    public Home home ;
    public CheckOut checkout;

    public STcTVWebsite()
    {
        home = new Home();
    }
}
