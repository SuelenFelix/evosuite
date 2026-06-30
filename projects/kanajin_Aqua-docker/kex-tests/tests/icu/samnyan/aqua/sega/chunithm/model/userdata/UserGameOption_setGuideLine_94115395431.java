package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOption_setGuideLine_94115395431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63107;
     Object term63407;

    public UserGameOption_setGuideLine_94115395431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63113 = new Long(-685023850445639859L);
        term63107 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term63109 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term63111 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63132 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63142 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63164 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63220 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63221 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63225 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63273 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63319 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63107, term63107.getClass(), "id", 707619162419050395L);
        setLongField(term63109, term63109.getClass(), "id", -2742794200189356451L);
        setLongField(term63111, term63111.getClass(), "id", 784504767592240462L);
        setField(term63111, term63111.getClass(), "extId", term63113);
        setField(term63111, term63111.getClass(), "luid", "NAwiEDVBcB");
        setIntField(term63128, term63128.getClass(), "year", 2020);
        setShortField(term63128, term63128.getClass(), "month", (short) 8);
        setShortField(term63128, term63128.getClass(), "day", (short) 5);
        setField(term63127, term63127.getClass(), "date", term63128);
        setByteField(term63132, term63132.getClass(), "hour", (byte) 12);
        setByteField(term63132, term63132.getClass(), "minute", (byte) 1);
        setByteField(term63132, term63132.getClass(), "second", (byte) 26);
        setIntField(term63132, term63132.getClass(), "nano", 71456472);
        setField(term63127, term63127.getClass(), "time", term63132);
        setField(term63111, term63111.getClass(), "registerTime", term63127);
        setIntField(term63138, term63138.getClass(), "year", 2011);
        setShortField(term63138, term63138.getClass(), "month", (short) 11);
        setShortField(term63138, term63138.getClass(), "day", (short) 10);
        setField(term63137, term63137.getClass(), "date", term63138);
        setByteField(term63142, term63142.getClass(), "hour", (byte) 6);
        setByteField(term63142, term63142.getClass(), "minute", (byte) 13);
        setByteField(term63142, term63142.getClass(), "second", (byte) 21);
        setIntField(term63142, term63142.getClass(), "nano", 381837054);
        setField(term63137, term63137.getClass(), "time", term63142);
        setField(term63111, term63111.getClass(), "accessTime", term63137);
        setField(term63109, term63109.getClass(), "card", term63111);
        setField(term63109, term63109.getClass(), "userName", "jxuVQHHLqy");
        setIntField(term63160, term63160.getClass(), "year", 2023);
        setShortField(term63160, term63160.getClass(), "month", (short) 5);
        setShortField(term63160, term63160.getClass(), "day", (short) 24);
        setField(term63159, term63159.getClass(), "date", term63160);
        setByteField(term63164, term63164.getClass(), "hour", (byte) 7);
        setByteField(term63164, term63164.getClass(), "minute", (byte) 37);
        setByteField(term63164, term63164.getClass(), "second", (byte) 7);
        setIntField(term63164, term63164.getClass(), "nano", 648887020);
        setField(term63159, term63159.getClass(), "time", term63164);
        setField(term63109, term63109.getClass(), "lastLoginDate", term63159);
        setBooleanField(term63109, term63109.getClass(), "isWebJoin", true);
        setField(term63109, term63109.getClass(), "webLimitDate", "TnUXNtKOns");
        setIntField(term63109, term63109.getClass(), "level", 600590922);
        setIntField(term63109, term63109.getClass(), "reincarnationNum", -215108807);
        setField(term63109, term63109.getClass(), "exp", "umsYdaPflb");
        setLongField(term63109, term63109.getClass(), "point", -2000525962887472969L);
        setLongField(term63109, term63109.getClass(), "totalPoint", 7651884502076816477L);
        setIntField(term63109, term63109.getClass(), "playCount", 427775680);
        setIntField(term63109, term63109.getClass(), "multiPlayCount", -1797721552);
        setIntField(term63109, term63109.getClass(), "multiWinCount", 1112300927);
        setIntField(term63109, term63109.getClass(), "requestResCount", -840496589);
        setIntField(term63109, term63109.getClass(), "acceptResCount", -491716923);
        setIntField(term63109, term63109.getClass(), "successResCount", -465766326);
        setIntField(term63109, term63109.getClass(), "playerRating", 369314367);
        setIntField(term63109, term63109.getClass(), "highestRating", 256576657);
        setIntField(term63109, term63109.getClass(), "nameplateId", 1029365631);
        setIntField(term63109, term63109.getClass(), "frameId", 833153549);
        setIntField(term63109, term63109.getClass(), "characterId", 2031081082);
        setIntField(term63109, term63109.getClass(), "trophyId", -595867565);
        setIntField(term63109, term63109.getClass(), "playedTutorialBit", -1428615750);
        setIntField(term63109, term63109.getClass(), "firstTutorialCancelNum", -247199850);
        setIntField(term63109, term63109.getClass(), "masterTutorialCancelNum", 1369708580);
        setIntField(term63109, term63109.getClass(), "totalRepertoireCount", -1943851319);
        setIntField(term63109, term63109.getClass(), "totalMapNum", 1613470339);
        setLongField(term63109, term63109.getClass(), "totalHiScore", -45437711112045954L);
        setLongField(term63109, term63109.getClass(), "totalBasicHighScore", -2665418140152906040L);
        setLongField(term63109, term63109.getClass(), "totalAdvancedHighScore", 590621623960257295L);
        setLongField(term63109, term63109.getClass(), "totalExpertHighScore", -3940823299046887533L);
        setLongField(term63109, term63109.getClass(), "totalMasterHighScore", 1916346681449508616L);
        setIntField(term63221, term63221.getClass(), "year", 2029);
        setShortField(term63221, term63221.getClass(), "month", (short) 8);
        setShortField(term63221, term63221.getClass(), "day", (short) 9);
        setField(term63220, term63220.getClass(), "date", term63221);
        setByteField(term63225, term63225.getClass(), "hour", (byte) 15);
        setByteField(term63225, term63225.getClass(), "minute", (byte) 45);
        setByteField(term63225, term63225.getClass(), "second", (byte) 28);
        setIntField(term63225, term63225.getClass(), "nano", 584909169);
        setField(term63220, term63220.getClass(), "time", term63225);
        setField(term63109, term63109.getClass(), "eventWatchedDate", term63220);
        setIntField(term63109, term63109.getClass(), "friendCount", 764077315);
        setBooleanField(term63109, term63109.getClass(), "isMaimai", true);
        setField(term63109, term63109.getClass(), "firstGameId", "CnNmpSyiBE");
        setField(term63109, term63109.getClass(), "firstRomVersion", "JvKKIGdUWh");
        setField(term63109, term63109.getClass(), "firstDataVersion", "DInvDrzBtt");
        setIntField(term63269, term63269.getClass(), "year", 2024);
        setShortField(term63269, term63269.getClass(), "month", (short) 10);
        setShortField(term63269, term63269.getClass(), "day", (short) 29);
        setField(term63268, term63268.getClass(), "date", term63269);
        setByteField(term63273, term63273.getClass(), "hour", (byte) 8);
        setByteField(term63273, term63273.getClass(), "minute", (byte) 39);
        setByteField(term63273, term63273.getClass(), "second", (byte) 36);
        setIntField(term63273, term63273.getClass(), "nano", 718768967);
        setField(term63268, term63268.getClass(), "time", term63273);
        setField(term63109, term63109.getClass(), "firstPlayDate", term63268);
        setField(term63109, term63109.getClass(), "lastGameId", "igZJubDPuK");
        setField(term63109, term63109.getClass(), "lastRomVersion", "qxBdFhLbAN");
        setField(term63109, term63109.getClass(), "lastDataVersion", "KyUmXHRrED");
        setIntField(term63315, term63315.getClass(), "year", 2010);
        setShortField(term63315, term63315.getClass(), "month", (short) 4);
        setShortField(term63315, term63315.getClass(), "day", (short) 5);
        setField(term63314, term63314.getClass(), "date", term63315);
        setByteField(term63319, term63319.getClass(), "hour", (byte) 6);
        setByteField(term63319, term63319.getClass(), "minute", (byte) 31);
        setByteField(term63319, term63319.getClass(), "second", (byte) 49);
        setIntField(term63319, term63319.getClass(), "nano", 665880484);
        setField(term63314, term63314.getClass(), "time", term63319);
        setField(term63109, term63109.getClass(), "lastPlayDate", term63314);
        setIntField(term63109, term63109.getClass(), "lastPlaceId", -127465158);
        setField(term63109, term63109.getClass(), "lastPlaceName", "eOMBFVrNcf");
        setField(term63109, term63109.getClass(), "lastRegionId", "gOwOIsocMB");
        setField(term63109, term63109.getClass(), "lastRegionName", "GqTBOhQBgV");
        setField(term63109, term63109.getClass(), "lastAllNetId", "DQhxOWqEyi");
        setField(term63109, term63109.getClass(), "lastClientId", "dSszYGDwAk");
        setField(term63107, term63107.getClass(), "user", term63109);
        setIntField(term63107, term63107.getClass(), "bgInfo", -727010746);
        setIntField(term63107, term63107.getClass(), "fieldColor", 1698984137);
        setIntField(term63107, term63107.getClass(), "guideSound", 1539842378);
        setIntField(term63107, term63107.getClass(), "soundEffect", -2020812793);
        setIntField(term63107, term63107.getClass(), "guideLine", 1214417682);
        setIntField(term63107, term63107.getClass(), "speed", -492639935);
        setIntField(term63107, term63107.getClass(), "optionSet", 1013003846);
        setIntField(term63107, term63107.getClass(), "matching", -1997703261);
        setIntField(term63107, term63107.getClass(), "judgePos", 1822676900);
        setIntField(term63107, term63107.getClass(), "rating", 1807366282);
        setIntField(term63107, term63107.getClass(), "judgeJustice", 1352119826);
        setIntField(term63107, term63107.getClass(), "judgeAttack", 399848636);
        setIntField(term63107, term63107.getClass(), "headphone", -1577579504);
        setIntField(term63107, term63107.getClass(), "playerLevel", -1664214126);
        setIntField(term63107, term63107.getClass(), "successTap", -124745318);
        setIntField(term63107, term63107.getClass(), "successExTap", 885215896);
        setIntField(term63107, term63107.getClass(), "successSlideHold", 1157850302);
        setIntField(term63107, term63107.getClass(), "successAir", -1748801993);
        setIntField(term63107, term63107.getClass(), "successFlick", -1351089042);
        setIntField(term63107, term63107.getClass(), "successSkill", -368642982);
        setIntField(term63107, term63107.getClass(), "successTapTimbre", 1100435548);
        setIntField(term63107, term63107.getClass(), "privacy", 1930975280);
        term63407 = new Integer(1639113177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63407;
        callMethod(klass, "setGuideLine", argTypes, term63107, args);
    }

};


