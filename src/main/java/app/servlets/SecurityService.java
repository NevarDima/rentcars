package app.servlets;

import app.entities.AuthUser;

public interface SecurityService {
    AuthUser login(String login, String password);
}
