package com.enel.momoffermanipulation.application.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cookie {

  private static final String IG_SESSIONID_CRUMB = "ig_sessionid=";
  private static final String LOCALE_CRUMB = "locale=";
  private static final String ENOC_SESSION_CRUMB = "enoc_session=";
  private static final String USER_NAME_CRUMB = "user_name=";

  private String rawCookie;
  private String locale;
  private String igSessionId;
  private String userName;
  private String sessionToken;

  public Cookie(String cookie) {
    this.rawCookie = cookie;
//    consumeCookie();
  }

//  private void consumeCookie() {
//    String[] crumbs = (StringUtils.isNullOrWhitespace(this.rawCookie)) ? new String[0] : this.rawCookie.split(";");
//    for (int i = 0; i < crumbs.length; i++) {
//      String crumbLc = StringExtensions.toLowerTrimmedOrEmpty(crumbs[i]);
//      if (crumbLc.startsWith(IG_SESSIONID_CRUMB)) {
//        igSessionId = crumbs[i].trim().substring(IG_SESSIONID_CRUMB.length());
//      } else if (crumbLc.startsWith(LOCALE_CRUMB)) {
//        locale = crumbs[i].trim().substring(LOCALE_CRUMB.length());
//      } else if (crumbLc.startsWith(ENOC_SESSION_CRUMB)) {
//        sessionToken = crumbs[i].trim().substring(ENOC_SESSION_CRUMB.length());
//      } else if (crumbLc.startsWith(USER_NAME_CRUMB)) {
//        userName = crumbs[i].trim().substring(USER_NAME_CRUMB.length());
//      }
//    }
//    if (igSessionId == null && userName == null) {
//      LoggerFactory.getLogger(Cookie.class).warn("Cookie.cutCookie",
//          "Failed to resolve identity from header cookie! Neither " + IG_SESSIONID_CRUMB + " nor " + USER_NAME_CRUMB
//              + " was found in the cookie crumbs. Cookie value=" + this.rawCookie);
//      igSessionId = "identity-not-resolved-from-cookie";
//    }
//  }

}
