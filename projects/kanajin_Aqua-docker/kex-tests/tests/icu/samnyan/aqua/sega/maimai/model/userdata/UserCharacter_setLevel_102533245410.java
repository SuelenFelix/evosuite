package icu.samnyan.aqua.sega.maimai.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserCharacter_setLevel_102533245410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35554;
     Object term35733;

    public UserCharacter_setLevel_102533245410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35560 = new Long(-4822736661741380518L);
        term35554 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term35556 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term35558 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term35574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35579 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35589 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35554, term35554.getClass(), "id", 3752337209837437327L);
        setLongField(term35556, term35556.getClass(), "id", 1860789353508856614L);
        setLongField(term35558, term35558.getClass(), "id", -7456852906235966771L);
        setField(term35558, term35558.getClass(), "extId", term35560);
        setField(term35558, term35558.getClass(), "luid", "ngeHWMRjnn");
        setIntField(term35575, term35575.getClass(), "year", 2016);
        setShortField(term35575, term35575.getClass(), "month", (short) 4);
        setShortField(term35575, term35575.getClass(), "day", (short) 23);
        setField(term35574, term35574.getClass(), "date", term35575);
        setByteField(term35579, term35579.getClass(), "hour", (byte) 13);
        setByteField(term35579, term35579.getClass(), "minute", (byte) 34);
        setByteField(term35579, term35579.getClass(), "second", (byte) 22);
        setIntField(term35579, term35579.getClass(), "nano", 20103660);
        setField(term35574, term35574.getClass(), "time", term35579);
        setField(term35558, term35558.getClass(), "registerTime", term35574);
        setIntField(term35585, term35585.getClass(), "year", 2023);
        setShortField(term35585, term35585.getClass(), "month", (short) 1);
        setShortField(term35585, term35585.getClass(), "day", (short) 24);
        setField(term35584, term35584.getClass(), "date", term35585);
        setByteField(term35589, term35589.getClass(), "hour", (byte) 10);
        setByteField(term35589, term35589.getClass(), "minute", (byte) 26);
        setByteField(term35589, term35589.getClass(), "second", (byte) 14);
        setIntField(term35589, term35589.getClass(), "nano", 736807866);
        setField(term35584, term35584.getClass(), "time", term35589);
        setField(term35558, term35558.getClass(), "accessTime", term35584);
        setField(term35556, term35556.getClass(), "card", term35558);
        setIntField(term35556, term35556.getClass(), "lastDataVersion", 209416345);
        setField(term35556, term35556.getClass(), "userName", "FOKfDXQxMM");
        setIntField(term35556, term35556.getClass(), "point", 119693843);
        setIntField(term35556, term35556.getClass(), "totalPoint", 1525937366);
        setIntField(term35556, term35556.getClass(), "iconId", 450142186);
        setIntField(term35556, term35556.getClass(), "nameplateId", 874917656);
        setIntField(term35556, term35556.getClass(), "frameId", 998050776);
        setIntField(term35556, term35556.getClass(), "trophyId", -1154360532);
        setIntField(term35556, term35556.getClass(), "playCount", -1414782360);
        setIntField(term35556, term35556.getClass(), "playVsCount", 812774787);
        setIntField(term35556, term35556.getClass(), "playSyncCount", 1955108847);
        setIntField(term35556, term35556.getClass(), "winCount", 601282140);
        setIntField(term35556, term35556.getClass(), "helpCount", -1989711686);
        setIntField(term35556, term35556.getClass(), "comboCount", -427352130);
        setIntField(term35556, term35556.getClass(), "feverCount", 490225359);
        setIntField(term35556, term35556.getClass(), "totalHiScore", 338229726);
        setIntField(term35556, term35556.getClass(), "totalEasyHighScore", -1891580978);
        setIntField(term35556, term35556.getClass(), "totalBasicHighScore", 1101260257);
        setIntField(term35556, term35556.getClass(), "totalAdvancedHighScore", 1800400048);
        setIntField(term35556, term35556.getClass(), "totalExpertHighScore", -1248348901);
        setIntField(term35556, term35556.getClass(), "totalMasterHighScore", -808864128);
        setIntField(term35556, term35556.getClass(), "totalReMasterHighScore", -1813216452);
        setIntField(term35556, term35556.getClass(), "totalHighSync", 180516410);
        setIntField(term35556, term35556.getClass(), "totalEasySync", 606206987);
        setIntField(term35556, term35556.getClass(), "totalBasicSync", -534930572);
        setIntField(term35556, term35556.getClass(), "totalAdvancedSync", -748140133);
        setIntField(term35556, term35556.getClass(), "totalExpertSync", 795993216);
        setIntField(term35556, term35556.getClass(), "totalMasterSync", 1583601182);
        setIntField(term35556, term35556.getClass(), "totalReMasterSync", -1372040155);
        setIntField(term35556, term35556.getClass(), "playerRating", 2091263178);
        setIntField(term35556, term35556.getClass(), "highestRating", -1726739412);
        setIntField(term35556, term35556.getClass(), "rankAuthTailId", -910985376);
        setField(term35556, term35556.getClass(), "eventWatchedDate", "gbxMvhrWpA");
        setField(term35556, term35556.getClass(), "webLimitDate", "huNTIobUHx");
        setIntField(term35556, term35556.getClass(), "challengeTrackPhase", 1260410174);
        setIntField(term35556, term35556.getClass(), "firstPlayBits", -1557704101);
        setField(term35556, term35556.getClass(), "lastPlayDate", "MrVeCmRVzF");
        setIntField(term35556, term35556.getClass(), "lastPlaceId", -764615686);
        setField(term35556, term35556.getClass(), "lastPlaceName", "CPVnQYACKw");
        setIntField(term35556, term35556.getClass(), "lastRegionId", -762034217);
        setField(term35556, term35556.getClass(), "lastRegionName", "sbdLhVCRsw");
        setField(term35556, term35556.getClass(), "lastClientId", "soJHvZwbtF");
        setField(term35556, term35556.getClass(), "lastCountryCode", "dTGwgkfDVj");
        setIntField(term35556, term35556.getClass(), "eventPoint", 481600552);
        setIntField(term35556, term35556.getClass(), "totalLv", 1415008678);
        setIntField(term35556, term35556.getClass(), "lastLoginBonusDay", -768389527);
        setIntField(term35556, term35556.getClass(), "lastSurvivalBonusDay", 88636719);
        setIntField(term35556, term35556.getClass(), "loginBonusLv", -18572829);
        setField(term35554, term35554.getClass(), "user", term35556);
        setIntField(term35554, term35554.getClass(), "characterId", 1220825104);
        setIntField(term35554, term35554.getClass(), "point", -401847632);
        setIntField(term35554, term35554.getClass(), "level", 1538271896);
        term35733 = new Integer(840990489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term35733;
        callMethod(klass, "setLevel", argTypes, term35554, args);
    }

};


