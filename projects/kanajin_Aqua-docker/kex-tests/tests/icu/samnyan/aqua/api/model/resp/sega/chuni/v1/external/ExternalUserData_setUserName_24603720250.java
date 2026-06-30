package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_setUserName_24603720250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20073;

    public ExternalUserData_setUserName_24603720250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20073 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term20098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20164 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20212 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20258 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term20073, term20073.getClass(), "accessCode", "BkIxsyPkGy");
        setField(term20073, term20073.getClass(), "userName", "mrMGwoRgVY");
        setIntField(term20099, term20099.getClass(), "year", 2017);
        setShortField(term20099, term20099.getClass(), "month", (short) 8);
        setShortField(term20099, term20099.getClass(), "day", (short) 6);
        setField(term20098, term20098.getClass(), "date", term20099);
        setByteField(term20103, term20103.getClass(), "hour", (byte) 22);
        setByteField(term20103, term20103.getClass(), "minute", (byte) 46);
        setByteField(term20103, term20103.getClass(), "second", (byte) 47);
        setIntField(term20103, term20103.getClass(), "nano", 782967389);
        setField(term20098, term20098.getClass(), "time", term20103);
        setField(term20073, term20073.getClass(), "lastLoginDate", term20098);
        setBooleanField(term20073, term20073.getClass(), "isWebJoin", true);
        setField(term20073, term20073.getClass(), "webLimitDate", "mxVLTgCwki");
        setIntField(term20073, term20073.getClass(), "level", -963198667);
        setIntField(term20073, term20073.getClass(), "reincarnationNum", -1007935918);
        setField(term20073, term20073.getClass(), "exp", "wCurppnDSA");
        setLongField(term20073, term20073.getClass(), "point", 3077284143733577490L);
        setLongField(term20073, term20073.getClass(), "totalPoint", 4458302820344896046L);
        setIntField(term20073, term20073.getClass(), "playCount", 1485731037);
        setIntField(term20073, term20073.getClass(), "multiPlayCount", 1304396087);
        setIntField(term20073, term20073.getClass(), "multiWinCount", 1782600602);
        setIntField(term20073, term20073.getClass(), "requestResCount", -185892708);
        setIntField(term20073, term20073.getClass(), "acceptResCount", -203163250);
        setIntField(term20073, term20073.getClass(), "successResCount", 498473526);
        setIntField(term20073, term20073.getClass(), "playerRating", 1186917020);
        setIntField(term20073, term20073.getClass(), "highestRating", 1670041824);
        setIntField(term20073, term20073.getClass(), "nameplateId", 2140388634);
        setIntField(term20073, term20073.getClass(), "frameId", 21095258);
        setIntField(term20073, term20073.getClass(), "characterId", -1793997256);
        setIntField(term20073, term20073.getClass(), "trophyId", -1271598018);
        setIntField(term20073, term20073.getClass(), "playedTutorialBit", 157967613);
        setIntField(term20073, term20073.getClass(), "firstTutorialCancelNum", 811839399);
        setIntField(term20073, term20073.getClass(), "masterTutorialCancelNum", 593962063);
        setIntField(term20073, term20073.getClass(), "totalRepertoireCount", -1485826786);
        setIntField(term20073, term20073.getClass(), "totalMapNum", -1549952664);
        setLongField(term20073, term20073.getClass(), "totalHiScore", -432424084523104253L);
        setLongField(term20073, term20073.getClass(), "totalBasicHighScore", 6150186973473930616L);
        setLongField(term20073, term20073.getClass(), "totalAdvancedHighScore", -3850323135468805420L);
        setLongField(term20073, term20073.getClass(), "totalExpertHighScore", -5207216109884759743L);
        setLongField(term20073, term20073.getClass(), "totalMasterHighScore", 8765880103547975810L);
        setIntField(term20160, term20160.getClass(), "year", 2029);
        setShortField(term20160, term20160.getClass(), "month", (short) 3);
        setShortField(term20160, term20160.getClass(), "day", (short) 3);
        setField(term20159, term20159.getClass(), "date", term20160);
        setByteField(term20164, term20164.getClass(), "hour", (byte) 2);
        setByteField(term20164, term20164.getClass(), "minute", (byte) 29);
        setByteField(term20164, term20164.getClass(), "second", (byte) 54);
        setIntField(term20164, term20164.getClass(), "nano", 846675209);
        setField(term20159, term20159.getClass(), "time", term20164);
        setField(term20073, term20073.getClass(), "eventWatchedDate", term20159);
        setIntField(term20073, term20073.getClass(), "friendCount", 148394188);
        setBooleanField(term20073, term20073.getClass(), "isMaimai", true);
        setField(term20073, term20073.getClass(), "firstGameId", "JydxSNTMYt");
        setField(term20073, term20073.getClass(), "firstRomVersion", "KpurAcrHYT");
        setField(term20073, term20073.getClass(), "firstDataVersion", "QjvDwgKJGz");
        setIntField(term20208, term20208.getClass(), "year", 2013);
        setShortField(term20208, term20208.getClass(), "month", (short) 1);
        setShortField(term20208, term20208.getClass(), "day", (short) 17);
        setField(term20207, term20207.getClass(), "date", term20208);
        setByteField(term20212, term20212.getClass(), "hour", (byte) 19);
        setByteField(term20212, term20212.getClass(), "minute", (byte) 49);
        setByteField(term20212, term20212.getClass(), "second", (byte) 53);
        setIntField(term20212, term20212.getClass(), "nano", 217542739);
        setField(term20207, term20207.getClass(), "time", term20212);
        setField(term20073, term20073.getClass(), "firstPlayDate", term20207);
        setField(term20073, term20073.getClass(), "lastGameId", "ngYxiXTZrk");
        setField(term20073, term20073.getClass(), "lastRomVersion", "YTxBqWRAlo");
        setField(term20073, term20073.getClass(), "lastDataVersion", "ReruUQRXwl");
        setIntField(term20254, term20254.getClass(), "year", 2025);
        setShortField(term20254, term20254.getClass(), "month", (short) 8);
        setShortField(term20254, term20254.getClass(), "day", (short) 8);
        setField(term20253, term20253.getClass(), "date", term20254);
        setByteField(term20258, term20258.getClass(), "hour", (byte) 12);
        setByteField(term20258, term20258.getClass(), "minute", (byte) 29);
        setByteField(term20258, term20258.getClass(), "second", (byte) 36);
        setIntField(term20258, term20258.getClass(), "nano", 329488602);
        setField(term20253, term20253.getClass(), "time", term20258);
        setField(term20073, term20073.getClass(), "lastPlayDate", term20253);
        setIntField(term20073, term20073.getClass(), "lastPlaceId", 504525721);
        setField(term20073, term20073.getClass(), "lastPlaceName", "DWEsVQwuaE");
        setField(term20073, term20073.getClass(), "lastRegionId", "qGkNzZAeDN");
        setField(term20073, term20073.getClass(), "lastRegionName", "wdtiuPgTVJ");
        setField(term20073, term20073.getClass(), "lastAllNetId", "HUgzMgrpsK");
        setField(term20073, term20073.getClass(), "lastClientId", "ubaBUfLolu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "itAUCFhZhq";
        callMethod(klass, "setUserName", argTypes, term20073, args);
    }

};


