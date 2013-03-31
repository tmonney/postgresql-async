package com.github.mauricio.postgresql.exceptions

import com.github.mauricio.postgresql.messages.backend.{AuthenticationResponseType, AuthenticationMessage}

/**
 * User: mauricio
 * Date: 3/31/13
 * Time: 1:39 AM
 */
class MissingCredentialInformationException (
                                              val username : String,
                                              val password : Option[String],
                                              val authenticationResponseType : AuthenticationResponseType.AuthenticationResponseType )
  extends IllegalStateException (
    "Username and password were required by auth type %s but are not available (username=[%s] password=[%s]".format(
      authenticationResponseType,
      username,
      password
    )
  )