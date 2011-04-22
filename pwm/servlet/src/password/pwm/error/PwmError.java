/*
 * Password Management Servlets (PWM)
 * http://code.google.com/p/pwm/
 *
 * Copyright (c) 2006-2009 Novell, Inc.
 * Copyright (c) 2009-2010 The PWM Project
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package password.pwm.error;

import com.novell.ldapchai.exception.ChaiError;
import password.pwm.util.PwmLogger;

import java.util.*;

/**
 * Utility class for managing messages returned by the servlet for inclusion in UI screens.
 * This class contains a set of constants that match a corresponding properties file which
 * follows ResourceBundle rules for structure and internationalization.
 *
 * @author Jason D. Rivard
 */
public enum PwmError {
    PASSWORD_MISSING_CONFIRM("Password_MissingConfirm", 4001),
    PASSWORD_MISSING("Password_Missing", 4002),
    PASSWORD_DOESNOTMATCH("Password_DoesNotMatch", 4003),
    PASSWORD_PREVIOUSLYUSED("Password_PreviouslyUsed", 4004, ChaiError.PASSWORD_PREVIOUSLYUSED),
    PASSWORD_BADOLDPASSWORD("Password_BadOldPassword", 4005, ChaiError.PASSWORD_BADOLDPASSWORD),
    PASSWORD_BADPASSWORD("Password_BadPassword", 4006, ChaiError.PASSWORD_BADPASSWORD),
    PASSWORD_TOO_SHORT("Password_TooShort", 4007, ChaiError.PASSWORD_TOO_SHORT),
    PASSWORD_TOO_LONG("Password_TooLong", 4008, ChaiError.PASSWORD_TOO_LONG),
    PASSWORD_NOT_ENOUGH_NUM("Password_NotEnoughNum", 4009, ChaiError.PASSWORD_NOT_ENOUGH_NUM),
    PASSWORD_NOT_ENOUGH_ALPHA("Password_NotEnoughAlpha", 4010, ChaiError.PASSWORD_NOT_ENOUGH_ALPHA),
    PASSWORD_NOT_ENOUGH_SPECIAL("Password_NotEnoughSpecial", 4011, ChaiError.PASSWORD_NOT_ENOUGH_SPECIAL),
    PASSWORD_NOT_ENOUGH_LOWER("Password_NotEnoughLower", 4012, ChaiError.PASSWORD_NOT_ENOUGH_LOWER),
    PASSWORD_NOT_ENOUGH_UPPER("Password_NotEnoughUpper", 4013, ChaiError.PASSWORD_NOT_ENOUGH_UPPER),
    PASSWORD_NOT_ENOUGH_UNIQUE("Password_NotEnoughUnique", 4014, ChaiError.PASSWORD_NOT_ENOUGH_UNIQUE),
    PASSWORD_TOO_MANY_REPEAT("Password_TooManyRepeat", 4015, ChaiError.PASSWORD_TOO_MANY_REPEAT),
    PASSWORD_TOO_MANY_NUMERIC("Password_TooManyNumeric", 4016, ChaiError.PASSWORD_TOO_MANY_NUMERIC, ChaiError.PASSWORD_NUMERIC_DISALLOWED),
    PASSWORD_TOO_MANY_ALPHA("Password_TooManyAlpha", 4017, ChaiError.PASSWORD_TOO_MANY_ALPHA),
    PASSWORD_TOO_MANY_LOWER("Password_TooManyLower", 4018, ChaiError.PASSWORD_TOO_MANY_LOWER),
    PASSWORD_TOO_MANY_UPPER("Password_TooManyUpper", 4019, ChaiError.PASSWORD_TOO_MANY_UPPER),
    PASSWORD_FIRST_IS_NUMERIC("Password_FirstIsNumeric", 4020, ChaiError.PASSWORD_FIRST_IS_NUMERIC),
    PASSWORD_LAST_IS_NUMERIC("Password_LastIsNumeric", 4021, ChaiError.PASSWORD_LAST_IS_NUMERIC),
    PASSWORD_FIRST_IS_SPECIAL("Password_FirstIsSpecial", 4022, ChaiError.PASSWORD_FIRST_IS_SPECIAL),
    PASSWORD_LAST_IS_SPECIAL("Password_LastIsSpecial", 4023, ChaiError.PASSWORD_LAST_IS_SPECIAL),
    PASSWORD_TOO_MANY_SPECIAL("Password_TooManyNonAlphaSpecial", 4024, ChaiError.PASSWORD_TOO_MANY_SPECIAL, ChaiError.PASSWORD_NUMERIC_DISALLOWED),
    PASSWORD_INVALID_CHAR("Password_InvalidChar", 4025, ChaiError.PASSWORD_INVALID_CHAR),
    PASSWORD_REQUIREDMISSING("Password_RequiredMissing", 4026),
    PASSWORD_INWORDLIST("Password_InWordlist", 4027, ChaiError.PASSWORD_INWORDLIST),
    PASSWORD_SAMEASOLD("Password_SameAsOld", 4028),
    PASSWORD_SAMEASATTR("Password_SameAsAttr", 4029, ChaiError.PASSWORD_SAMEASATTR),
    PASSWORD_MEETS_RULES("Password_MeetsRules", 4030),
    PASSWORD_TOO_MANY_OLD_CHARS("Password_TooManyOldChars", 4031),
    PASSWORD_HISTORY_FULL("Password_HistoryFull", 4032, ChaiError.PASSWORD_HISTORY_FULL),
    PASSWORD_TOO_SOON("Password_TooSoon", 4033, ChaiError.PASSWORD_TOO_SOON),
    PASSWORD_USING_DISALLOWED_VALUE("Password_UsingDisallowedValue", 4034),
    PASSWORD_TOO_WEAK("Password_TooWeak", 4035),
    PASSWORD_TOO_MANY_NON_ALPHA("Password_TooManyMonAlpha", 4036),
    PASSWORD_NOT_ENOUGH_NON_ALPHA("Password_NotEnoughNonAlpha", 4036),
    PASSWORD_UNKNOWN_VALIDATION("Password_UnknownValidation", 4037),

    NUMBERVALIDATION_INVALIDNUMER("NumberValidation_Invalid_Number", 4101),
    NUMBERVALIDATION_LOWERBOUND("NumberValidation_Lowerbound", 4102),
    NUMBERVALIDATION_UPPERBOUND("NumberValidation_Upperbound", 4103),

    ERROR_WRONGPASSWORD("Error_WrongPassword", 5001),
    ERROR_WRONGANSWER("Error_WrongAnswer", 5002),
    ERROR_USERAUTHENTICATED("Error_UserAuthenticated", 5003),
    ERROR_AUTHENTICATION_REQUIRED("Error_AuthenticationRequired", 5004),
    ERROR_RESPONSE_WRONGUSER("Error_Response_WrongUsername", 5005),
    ERROR_RESPONSES_NORESPONSES("Error_Response_NoResponse", 5006),
    ERROR_RESPONSE_WORDLIST("Error_Response_Wordlist", 5007),
    ERROR_RESPONSE_TOO_SHORT("Error_Response_TooShort", 5008),
    ERROR_RESPONSE_TOO_LONG("Error_Response_TooLong", 5009),
    ERROR_RESPONSE_DUPLICATE("Error_Response_Duplicate", 5010),
    ERROR_CHALLENGE_DUPLICATE("Error_Challenge_Duplicate", 5011),
    ERROR_MISSING_CHALLENGE_TEXT("Error_Missing_Challenge_Text", 5012),
    ERROR_MISSING_PARAMETER("Error_MissingParameter", 5013),
    ERROR_FIELDS_DONT_MATCH("Error_FieldsDontMatch", 5014),
    ERROR_UNKNOWN("Error_Unknown", 5015),
    ERROR_CANT_MATCH_USER("Error_CantMatchUser", 5016),
    ERROR_DIRECTORY_UNAVAILABLE("Error_DirectoryUnavailable", 5017),
    ERROR_NEW_USER_VALIDATION_FAILED("Error_NewUserValidationFailed", 5018),
    ERROR_SERVICE_NOT_AVAILABLE("Error_ServiceNotAvailable", 5019),
    ERROR_USER_MISMATCH("Error_UserMisMatch", 5020),
    ERROR_ACTIVATE_USER_NO_QUERY_MATCH("Error_ActivateUserNoQueryMatch", 5021),
    ERROR_NO_CHALLENGES("Error_NoChallenges", 5022),
    ERROR_INTRUDER_USER("Error_UserIntruder", 5023),
    ERROR_INTRUDER_ADDRESS("Error_AddressIntruder", 5024),
    ERROR_INTRUDER_SESSION("Error_SessionIntruder", 5025),
    ERROR_BAD_SESSION_PASSWORD("Error_BadSessionPassword", 5026),
    ERROR_UNAUTHORIZED("Error_Unauthorized", 5027),
    ERROR_BAD_SESSION("Error_BadSession", 5028),
    ERROR_MISSING_REQUIRED_RESPONSE("Error_MissingRequiredResponse", 5029),
    ERROR_MISSING_RANDOM_RESPONSE("Error_MissingRandomResponse", 5030),
    ERROR_BAD_CAPTCHA_RESPONSE("Error_BadCaptchaResponse", 5031),
    ERROR_CAPTCHA_API_ERROR("Error_CaptchaAPIError", 5032),
    ERROR_INVALID_CONFIG("Error_InvalidConfig", 5033),
    ERROR_INVALID_FORMID("Error_InvalidFormID", 5034),
    ERROR_MISSING_NAMING_ATTR("Error_MissingNamingAttr", 5035),
    ERROR_TOKEN_MISSING_CONTACT("Error_TokenMissingContact", 5036),
    ERROR_TOKEN_INCORRECT("Error_TokenIncorrect", 5037),
    ERROR_BAD_CURRENT_PASSWORD("Error_BadCurrentPassword", 5038),
    ERROR_CLOSING("Error_Closing", 5039),
    ERROR_MISSING_GUID("Error_Missing_GUID", 5040),
    ERROR_TOKEN_EXPIRED("Error_TokenExpired", 5041),
    ERROR_MULTI_USERNAME("Error_Multi_Username", 5042),
    ERROR_ORIG_ADMIN_ONLY("Error_Orig_Admin_Only", 5043),

    ERROR_FIELD_REQUIRED("Error_FieldRequired", 5100),
    ERROR_FIELD_NOT_A_NUMBER("Error_FieldNotANumber", 5101),
    ERROR_FIELD_INVALID_EMAIL("Error_FieldInvalidEmail", 5102),
    ERROR_FIELD_TOO_SHORT("Error_FieldTooShort", 5103),
    ERROR_FIELD_TOO_LONG("Error_FieldTooLong", 5104),
    ERROR_FIELD_DUPLICATE("Error_FieldDuplicate", 5105),
    ERROR_FIELD_BAD_CONFIRM("Error_FieldBadConfirm", 5106),

    CONFIG_UPLOAD_SUCCESS("Error_ConfigUploadSuccess", 5200),
    CONFIG_UPLOAD_FAILURE("Error_ConfigUploadFailure", 5201),
    CONFIG_SAVE_SUCCESS("Error_ConfigSaveSuccess", 5203),
    CONFIG_FORMAT_ERROR("Error_ConfigFormatError", 5203),
    CONFIG_LDAP_FAILURE("Error_ConfigLdapFailure", 5204),
    CONFIG_LDAP_SUCCESS("Error_ConfigLdapSuccess", 5205),

    ERROR_HTTP_404("Error_HTTP_404",5300),

    ;


// ------------------------------ FIELDS ------------------------------

    public static String FIELD_REPLACE_VALUE = "%field%";

    private static final PwmLogger LOGGER = PwmLogger.getLogger(PwmError.class);

    private final int errorCode;
    private final String resourceKey;
    private final ChaiError[] chaiErrorCode;

// -------------------------- STATIC METHODS --------------------------

    public static String getLocalizedMessage(final Locale locale, final PwmError message) {
        return getLocalizedMessage(locale, message, null);
    }

    public static String getLocalizedMessage(final Locale locale, final PwmError message, final String fieldValue) {
        final ResourceBundle bundle = getMessageBundle(locale);
        String result = message.getResourceKey();
        try {
            result = bundle.getString(message.getResourceKey());
            if (fieldValue != null) {
                result = result.replaceAll(FIELD_REPLACE_VALUE, fieldValue);
            }
        } catch (Exception e) {
            LOGGER.trace("error fetching localized key for '" + message + "', error: " + e.getMessage());
        }
        return result;
    }

    private static ResourceBundle getMessageBundle(final Locale locale) {
        final ResourceBundle messagesBundle;
        if (locale == null) {
            messagesBundle = ResourceBundle.getBundle(PwmError.class.getName());
        } else {
            messagesBundle = ResourceBundle.getBundle(PwmError.class.getName(), locale);
        }

        return messagesBundle;
    }

    public static String getDisplayString(final String key, final Locale locale) {
        final ResourceBundle bundle = getMessageBundle(locale);
        return bundle.getString(key);
    }

    public static Set<String> getDisplayKeys() {
        final ResourceBundle bundle = getMessageBundle(null);
        final Set<String> returnSet = new TreeSet<String>();
        for (final Enumeration keyEnum = bundle.getKeys(); keyEnum.hasMoreElements(); ) {
            returnSet.add(keyEnum.nextElement().toString());
        }
        return returnSet;
    }

    public static PwmError forChaiError(final ChaiError errorCode) {
        if (errorCode == null) {
            return null;
        }

        for (final PwmError pwmError : values()) {
            if (pwmError.chaiErrorCode != null) {
                for (final ChaiError loopCode : pwmError.chaiErrorCode) {
                    if (loopCode == errorCode) {
                        return pwmError;
                    }
                }
            }
        }

        return null;
    }

// --------------------------- CONSTRUCTORS ---------------------------

    PwmError(final String resourceKey, final int errorCode, final ChaiError... chaiErrorCode) {
        this.resourceKey = resourceKey;
        this.chaiErrorCode = chaiErrorCode;
        this.errorCode = errorCode;
    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getResourceKey() {
        return resourceKey;
    }

    public int getErrorCode() {
        return errorCode;
    }

    // -------------------------- OTHER METHODS --------------------------

    public String getLocalizedMessage(final Locale locale) {
        return PwmError.getLocalizedMessage(locale, this);
    }

    public String getLocalizedMessage(final Locale locale, final String fieldValue) {
        return PwmError.getLocalizedMessage(locale, this, fieldValue);
    }

    public ErrorInformation toInfo() {
        return new ErrorInformation(this);
    }

}


