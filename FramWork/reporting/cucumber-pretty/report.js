$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginwithdatabases.feature");
formatter.feature({
  "line": 1,
  "name": "databases",
  "description": "",
  "id": "databases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 36504780504,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "databases;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@databases"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#When   Enter invalid email and password"
    }
  ],
  "line": 6,
  "name": "Enter invalid email and password from Data_Table",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "tlover781@gmail.com",
        "84969o4"
      ],
      "line": 8
    },
    {
      "cells": [
        "myname@gmail.com",
        "768368"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Error message appear",
  "keyword": "Then "
});
formatter.match({
  "location": "databasesDefition.user_is_in_login_page()"
});
formatter.result({
  "duration": 3099186933,
  "status": "passed"
});
formatter.match({
  "location": "databasesDefition.enter_invalid_email_and_password_from_Data_Table(DataTable)"
});
formatter.result({
  "duration": 110853055,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: keys should be a string\n  (Session info: chrome\u003d77.0.3865.120)\n  (Driver info: chromedriver\u003d2.42.591059 (a3d9684d10d61aa0c45f6723b327283be1ebaad8),platform\u003dMac OS X 10.15.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 33 milliseconds\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027Miduls-MacBook-Pro.local\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u00271.8.0_212\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:49367}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.42.591059 (a3d9684d10d61aa0c45f6723b327283be1ebaad8), userDataDir\u003d/var/folders/5c/vk4z5x313rj16tj2qj9dp9th0000gn/T/.org.chromium.Chromium.wKOyWM}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d77.0.3865.120, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 41399af6f13656a68b56fe1482cbe5c1\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:274)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:98)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy16.sendKeys(Unknown Source)\n\tat base.ApplicationPageBase.sendKeys(ApplicationPageBase.java:30)\n\tat Objects.Login.login(Login.java:27)\n\tat StepDefinitions.databasesDefition.enter_invalid_email_and_password_from_Data_Table(databasesDefition.java:24)\n\tat ✽.When Enter invalid email and password from Data_Table(loginwithdatabases.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "databasesDefition.error_message_appear()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 80312197,
  "status": "passed"
});
});