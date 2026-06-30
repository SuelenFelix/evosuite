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

public class UserGeneralData_setId_1693924095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296089;
     Object term296378;

    public UserGeneralData_setId_1693924095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term296095 = new Long(-8605430501912680279L);
        term296089 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term296091 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term296093 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term296109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term296110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term296114 = newInstance(Class.forName("java.time.LocalTime"));
        Object term296119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term296120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term296124 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term296089, term296089.getClass(), "id", -6609205491277046614L);
        setLongField(term296091, term296091.getClass(), "id", -6623875857355546424L);
        setLongField(term296093, term296093.getClass(), "id", -557830694835802420L);
        setField(term296093, term296093.getClass(), "extId", term296095);
        setField(term296093, term296093.getClass(), "luid", "HzMfMKgKlf");
        setIntField(term296110, term296110.getClass(), "year", 2021);
        setShortField(term296110, term296110.getClass(), "month", (short) 5);
        setShortField(term296110, term296110.getClass(), "day", (short) 14);
        setField(term296109, term296109.getClass(), "date", term296110);
        setByteField(term296114, term296114.getClass(), "hour", (byte) 2);
        setByteField(term296114, term296114.getClass(), "minute", (byte) 44);
        setByteField(term296114, term296114.getClass(), "second", (byte) 8);
        setIntField(term296114, term296114.getClass(), "nano", 275891873);
        setField(term296109, term296109.getClass(), "time", term296114);
        setField(term296093, term296093.getClass(), "registerTime", term296109);
        setIntField(term296120, term296120.getClass(), "year", 2011);
        setShortField(term296120, term296120.getClass(), "month", (short) 12);
        setShortField(term296120, term296120.getClass(), "day", (short) 7);
        setField(term296119, term296119.getClass(), "date", term296120);
        setByteField(term296124, term296124.getClass(), "hour", (byte) 21);
        setByteField(term296124, term296124.getClass(), "minute", (byte) 9);
        setByteField(term296124, term296124.getClass(), "second", (byte) 21);
        setIntField(term296124, term296124.getClass(), "nano", 958199370);
        setField(term296119, term296119.getClass(), "time", term296124);
        setField(term296093, term296093.getClass(), "accessTime", term296119);
        setField(term296091, term296091.getClass(), "card", term296093);
        setField(term296091, term296091.getClass(), "userName", "syeDEkvOkO");
        setIntField(term296091, term296091.getClass(), "level", -109520941);
        setIntField(term296091, term296091.getClass(), "reincarnationNum", 1702695026);
        setLongField(term296091, term296091.getClass(), "exp", 4497611110445581549L);
        setLongField(term296091, term296091.getClass(), "point", -797862547751310354L);
        setLongField(term296091, term296091.getClass(), "totalPoint", -1119432641333782017L);
        setIntField(term296091, term296091.getClass(), "playCount", -1269287323);
        setIntField(term296091, term296091.getClass(), "jewelCount", -1615669185);
        setIntField(term296091, term296091.getClass(), "totalJewelCount", -2034394499);
        setIntField(term296091, term296091.getClass(), "medalCount", -412683553);
        setIntField(term296091, term296091.getClass(), "playerRating", 1603210066);
        setIntField(term296091, term296091.getClass(), "highestRating", -1776491130);
        setIntField(term296091, term296091.getClass(), "battlePoint", -1930642248);
        setIntField(term296091, term296091.getClass(), "bestBattlePoint", 1916918462);
        setIntField(term296091, term296091.getClass(), "overDamageBattlePoint", 1696395174);
        setBooleanField(term296091, term296091.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term296091, term296091.getClass(), "nameplateId", -705525513);
        setIntField(term296091, term296091.getClass(), "trophyId", 700196671);
        setIntField(term296091, term296091.getClass(), "cardId", 1231328189);
        setIntField(term296091, term296091.getClass(), "characterId", -1306445208);
        setIntField(term296091, term296091.getClass(), "characterVoiceNo", 512197370);
        setIntField(term296091, term296091.getClass(), "tabSetting", -1450943187);
        setIntField(term296091, term296091.getClass(), "tabSortSetting", 1336843745);
        setIntField(term296091, term296091.getClass(), "cardCategorySetting", -1179901298);
        setIntField(term296091, term296091.getClass(), "cardSortSetting", 203756412);
        setIntField(term296091, term296091.getClass(), "rivalScoreCategorySetting", 2065759847);
        setIntField(term296091, term296091.getClass(), "playedTutorialBit", 1849946351);
        setIntField(term296091, term296091.getClass(), "firstTutorialCancelNum", -1133721458);
        setLongField(term296091, term296091.getClass(), "sumTechHighScore", 358075386422694671L);
        setLongField(term296091, term296091.getClass(), "sumTechBasicHighScore", -5900553757884007998L);
        setLongField(term296091, term296091.getClass(), "sumTechAdvancedHighScore", -955610313044173712L);
        setLongField(term296091, term296091.getClass(), "sumTechExpertHighScore", 5128322966187572180L);
        setLongField(term296091, term296091.getClass(), "sumTechMasterHighScore", -5286860535876541099L);
        setLongField(term296091, term296091.getClass(), "sumTechLunaticHighScore", -974049481834049263L);
        setLongField(term296091, term296091.getClass(), "sumBattleHighScore", 5540641369387881484L);
        setLongField(term296091, term296091.getClass(), "sumBattleBasicHighScore", -4610978177778929352L);
        setLongField(term296091, term296091.getClass(), "sumBattleAdvancedHighScore", -2078275063121676242L);
        setLongField(term296091, term296091.getClass(), "sumBattleExpertHighScore", 4784115580135603918L);
        setLongField(term296091, term296091.getClass(), "sumBattleMasterHighScore", -8626126784255841500L);
        setLongField(term296091, term296091.getClass(), "sumBattleLunaticHighScore", 2675848108346000706L);
        setField(term296091, term296091.getClass(), "eventWatchedDate", "sgApZzdiHM");
        setField(term296091, term296091.getClass(), "cmEventWatchedDate", "vAEHmJcPSd");
        setField(term296091, term296091.getClass(), "firstGameId", "dOvqKQlKUa");
        setField(term296091, term296091.getClass(), "firstRomVersion", "ZjyndZHfXg");
        setField(term296091, term296091.getClass(), "firstDataVersion", "mWarigMEMX");
        setField(term296091, term296091.getClass(), "firstPlayDate", "UbOEkDKQTT");
        setField(term296091, term296091.getClass(), "lastGameId", "IWWuxiwNhE");
        setField(term296091, term296091.getClass(), "lastRomVersion", "tecOgyBctJ");
        setField(term296091, term296091.getClass(), "lastDataVersion", "rSSuONUDGA");
        setField(term296091, term296091.getClass(), "compatibleCmVersion", "WmInSFSxSk");
        setField(term296091, term296091.getClass(), "lastPlayDate", "rmbZwfUyua");
        setIntField(term296091, term296091.getClass(), "lastPlaceId", 640615922);
        setField(term296091, term296091.getClass(), "lastPlaceName", "GzCjLjIGCd");
        setIntField(term296091, term296091.getClass(), "lastRegionId", 171081050);
        setField(term296091, term296091.getClass(), "lastRegionName", "oYSEWvyjcR");
        setIntField(term296091, term296091.getClass(), "lastAllNetId", 632754702);
        setField(term296091, term296091.getClass(), "lastClientId", "VMmhmTHSAL");
        setIntField(term296091, term296091.getClass(), "lastUsedDeckId", -1841445580);
        setIntField(term296091, term296091.getClass(), "lastPlayMusicLevel", 2076113309);
        setIntField(term296091, term296091.getClass(), "lastEmoneyBrand", -2032600090);
        setField(term296089, term296089.getClass(), "user", term296091);
        setField(term296089, term296089.getClass(), "propertyKey", "XGtrhXNaMV");
        setField(term296089, term296089.getClass(), "propertyValue", "KlhHeZgItV");
        term296378 = new Long(3941154676649850092L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term296378;
        callMethod(klass, "setId", argTypes, term296089, args);
    }

};


