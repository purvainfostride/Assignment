$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Purva/eclipse-workspace/bddFramework.HRM/src/test/java/featureFiles/Login.feature");
formatter.feature({
  "name": "Checking Login functionality of application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking Login functionality with the valid login credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@validcredentials"
    }
  ]
});
formatter.step({
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username in the username textfield and password in password textfield",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_username_in_the_username_textfield_and_password_in_password_textfield(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_on_Homepage()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d98.0.4758.82)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MSDT007\u0027, ip: \u002710.20.20.50\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.82, chrome: {chromedriverVersion: 97.0.4692.71 (adefa7837d02a..., userDataDir: C:\\Users\\Purva\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62402}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 006add7e25fe67f26bbcb2852bc2bafc\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getCurrentUrl(RemoteWebDriver.java:287)\r\n\tat stepDefinitions.Login.user_is_on_Homepage(Login.java:48)\r\n\tat ✽.user is on Homepage(C:/Users/Purva/eclipse-workspace/bddFramework.HRM/src/test/java/featureFiles/Login.feature:8)\r\n",
  "status": "failed"
});
});