package com.restbucks.bff.wechatstore.wechat;

public interface WeChatClient {

    WeChatOauthAccessToken exchangeAccessTokenWith(String code);

    WeChatUser exchangeUserProfileWith(WeChatOauthAccessToken accessToken);
}
