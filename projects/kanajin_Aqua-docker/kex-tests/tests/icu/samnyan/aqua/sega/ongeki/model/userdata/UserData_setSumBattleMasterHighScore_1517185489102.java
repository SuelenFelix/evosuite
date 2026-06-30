package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_setSumBattleMasterHighScore_1517185489102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65208;
     Object term65471;

    public UserData_setSumBattleMasterHighScore_1517185489102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term65212 = new Long(1457594663983990440L);
        term65208 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term65210 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term65226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65241 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term65208, term65208.getClass(), "id", 5608996079421235543L);
        setLongField(term65210, term65210.getClass(), "id", 8528484863342605856L);
        setField(term65210, term65210.getClass(), "extId", term65212);
        setField(term65210, term65210.getClass(), "luid", "diWnDDpNWl");
        setIntField(term65227, term65227.getClass(), "year", 2018);
        setShortField(term65227, term65227.getClass(), "month", (short) 7);
        setShortField(term65227, term65227.getClass(), "day", (short) 24);
        setField(term65226, term65226.getClass(), "date", term65227);
        setByteField(term65231, term65231.getClass(), "hour", (byte) 8);
        setByteField(term65231, term65231.getClass(), "minute", (byte) 32);
        setByteField(term65231, term65231.getClass(), "second", (byte) 43);
        setIntField(term65231, term65231.getClass(), "nano", 490940025);
        setField(term65226, term65226.getClass(), "time", term65231);
        setField(term65210, term65210.getClass(), "registerTime", term65226);
        setIntField(term65237, term65237.getClass(), "year", 2018);
        setShortField(term65237, term65237.getClass(), "month", (short) 7);
        setShortField(term65237, term65237.getClass(), "day", (short) 6);
        setField(term65236, term65236.getClass(), "date", term65237);
        setByteField(term65241, term65241.getClass(), "hour", (byte) 6);
        setByteField(term65241, term65241.getClass(), "minute", (byte) 33);
        setByteField(term65241, term65241.getClass(), "second", (byte) 21);
        setIntField(term65241, term65241.getClass(), "nano", 484192339);
        setField(term65236, term65236.getClass(), "time", term65241);
        setField(term65210, term65210.getClass(), "accessTime", term65236);
        setField(term65208, term65208.getClass(), "card", term65210);
        setField(term65208, term65208.getClass(), "userName", "jcrJhyEbDI");
        setIntField(term65208, term65208.getClass(), "level", 313791373);
        setIntField(term65208, term65208.getClass(), "reincarnationNum", -1757202955);
        setLongField(term65208, term65208.getClass(), "exp", -5895312352966511908L);
        setLongField(term65208, term65208.getClass(), "point", -9221881606533616155L);
        setLongField(term65208, term65208.getClass(), "totalPoint", -478523971987034249L);
        setIntField(term65208, term65208.getClass(), "playCount", -1618822811);
        setIntField(term65208, term65208.getClass(), "jewelCount", -850405849);
        setIntField(term65208, term65208.getClass(), "totalJewelCount", -545145172);
        setIntField(term65208, term65208.getClass(), "medalCount", -2069653687);
        setIntField(term65208, term65208.getClass(), "playerRating", -1832612963);
        setIntField(term65208, term65208.getClass(), "highestRating", 1064073662);
        setIntField(term65208, term65208.getClass(), "battlePoint", 1120854991);
        setIntField(term65208, term65208.getClass(), "bestBattlePoint", 1448504845);
        setIntField(term65208, term65208.getClass(), "overDamageBattlePoint", 451612513);
        setBooleanField(term65208, term65208.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term65208, term65208.getClass(), "nameplateId", 343920197);
        setIntField(term65208, term65208.getClass(), "trophyId", -521630681);
        setIntField(term65208, term65208.getClass(), "cardId", 1297681432);
        setIntField(term65208, term65208.getClass(), "characterId", 820668311);
        setIntField(term65208, term65208.getClass(), "characterVoiceNo", -43239204);
        setIntField(term65208, term65208.getClass(), "tabSetting", -1525054580);
        setIntField(term65208, term65208.getClass(), "tabSortSetting", 1528804559);
        setIntField(term65208, term65208.getClass(), "cardCategorySetting", -706860271);
        setIntField(term65208, term65208.getClass(), "cardSortSetting", -1268460209);
        setIntField(term65208, term65208.getClass(), "rivalScoreCategorySetting", 1050300885);
        setIntField(term65208, term65208.getClass(), "playedTutorialBit", -1623966228);
        setIntField(term65208, term65208.getClass(), "firstTutorialCancelNum", 1085534206);
        setLongField(term65208, term65208.getClass(), "sumTechHighScore", -1224531332957849467L);
        setLongField(term65208, term65208.getClass(), "sumTechBasicHighScore", -1754875963776707251L);
        setLongField(term65208, term65208.getClass(), "sumTechAdvancedHighScore", -8762863231523446946L);
        setLongField(term65208, term65208.getClass(), "sumTechExpertHighScore", -1440107863491666180L);
        setLongField(term65208, term65208.getClass(), "sumTechMasterHighScore", -794666317429849604L);
        setLongField(term65208, term65208.getClass(), "sumTechLunaticHighScore", 8252743985077808790L);
        setLongField(term65208, term65208.getClass(), "sumBattleHighScore", 7266188540048777915L);
        setLongField(term65208, term65208.getClass(), "sumBattleBasicHighScore", 5879881453700146413L);
        setLongField(term65208, term65208.getClass(), "sumBattleAdvancedHighScore", 1992717981382367665L);
        setLongField(term65208, term65208.getClass(), "sumBattleExpertHighScore", -2089468866117654256L);
        setLongField(term65208, term65208.getClass(), "sumBattleMasterHighScore", 4709510901953794506L);
        setLongField(term65208, term65208.getClass(), "sumBattleLunaticHighScore", 5365925708045689878L);
        setField(term65208, term65208.getClass(), "eventWatchedDate", "DHbGOjJfEz");
        setField(term65208, term65208.getClass(), "cmEventWatchedDate", "OuyHNwADel");
        setField(term65208, term65208.getClass(), "firstGameId", "shazlRAQrB");
        setField(term65208, term65208.getClass(), "firstRomVersion", "PNJdNWkxgW");
        setField(term65208, term65208.getClass(), "firstDataVersion", "aCTJvzQZSQ");
        setField(term65208, term65208.getClass(), "firstPlayDate", "hcvedmWnmW");
        setField(term65208, term65208.getClass(), "lastGameId", "rBZaHWidIS");
        setField(term65208, term65208.getClass(), "lastRomVersion", "xneQCADwGB");
        setField(term65208, term65208.getClass(), "lastDataVersion", "luSCmxphxi");
        setField(term65208, term65208.getClass(), "compatibleCmVersion", "OGEDwuJhjV");
        setField(term65208, term65208.getClass(), "lastPlayDate", "vepOtOxlWM");
        setIntField(term65208, term65208.getClass(), "lastPlaceId", -825946504);
        setField(term65208, term65208.getClass(), "lastPlaceName", "XZmoxlxcKh");
        setIntField(term65208, term65208.getClass(), "lastRegionId", 1618408809);
        setField(term65208, term65208.getClass(), "lastRegionName", "aHNGawFCfD");
        setIntField(term65208, term65208.getClass(), "lastAllNetId", 1511487617);
        setField(term65208, term65208.getClass(), "lastClientId", "cHjhnXKTVF");
        setIntField(term65208, term65208.getClass(), "lastUsedDeckId", 338598562);
        setIntField(term65208, term65208.getClass(), "lastPlayMusicLevel", 1528748257);
        setIntField(term65208, term65208.getClass(), "lastEmoneyBrand", 494744342);
        term65471 = new Long(-3770150361529994189L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term65471;
        callMethod(klass, "setSumBattleMasterHighScore", argTypes, term65208, args);
    }

};


