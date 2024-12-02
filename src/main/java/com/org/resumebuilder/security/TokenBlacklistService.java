package com.org.resumebuilder.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class TokenBlacklistService {

	private final Set<String> blacklistedTokens = new HashSet<>();

	public void blacklistToken(String token) {
		blacklistedTokens.add(token);
	}

	public boolean isTokenBlacklisted(String token) {
		return blacklistedTokens.contains(token);
	}
}
