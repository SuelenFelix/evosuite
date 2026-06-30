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

public class UserGameOption_setGuideSound_79483687329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62203;
     Object term62503;

    public UserGameOption_setGuideSound_79483687329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62209 = new Long(1215116475929634177L);
        term62203 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term62205 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term62207 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term62223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62228 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62233 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62234 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62238 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62260 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62321 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62415 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term62203, term62203.getClass(), "id", -431846534131845221L);
        setLongField(term62205, term62205.getClass(), "id", -1676755477328808985L);
        setLongField(term62207, term62207.getClass(), "id", 6429812737969607903L);
        setField(term62207, term62207.getClass(), "extId", term62209);
        setField(term62207, term62207.getClass(), "luid", "lvdsucnNvR");
        setIntField(term62224, term62224.getClass(), "year", 2014);
        setShortField(term62224, term62224.getClass(), "month", (short) 12);
        setShortField(term62224, term62224.getClass(), "day", (short) 28);
        setField(term62223, term62223.getClass(), "date", term62224);
        setByteField(term62228, term62228.getClass(), "hour", (byte) 2);
        setByteField(term62228, term62228.getClass(), "minute", (byte) 44);
        setByteField(term62228, term62228.getClass(), "second", (byte) 18);
        setIntField(term62228, term62228.getClass(), "nano", 39913942);
        setField(term62223, term62223.getClass(), "time", term62228);
        setField(term62207, term62207.getClass(), "registerTime", term62223);
        setIntField(term62234, term62234.getClass(), "year", 2020);
        setShortField(term62234, term62234.getClass(), "month", (short) 11);
        setShortField(term62234, term62234.getClass(), "day", (short) 29);
        setField(term62233, term62233.getClass(), "date", term62234);
        setByteField(term62238, term62238.getClass(), "hour", (byte) 0);
        setByteField(term62238, term62238.getClass(), "minute", (byte) 40);
        setByteField(term62238, term62238.getClass(), "second", (byte) 23);
        setIntField(term62238, term62238.getClass(), "nano", 204732115);
        setField(term62233, term62233.getClass(), "time", term62238);
        setField(term62207, term62207.getClass(), "accessTime", term62233);
        setField(term62205, term62205.getClass(), "card", term62207);
        setField(term62205, term62205.getClass(), "userName", "mSjSKfeMUn");
        setIntField(term62256, term62256.getClass(), "year", 2025);
        setShortField(term62256, term62256.getClass(), "month", (short) 3);
        setShortField(term62256, term62256.getClass(), "day", (short) 2);
        setField(term62255, term62255.getClass(), "date", term62256);
        setByteField(term62260, term62260.getClass(), "hour", (byte) 23);
        setByteField(term62260, term62260.getClass(), "minute", (byte) 28);
        setByteField(term62260, term62260.getClass(), "second", (byte) 42);
        setIntField(term62260, term62260.getClass(), "nano", 204636448);
        setField(term62255, term62255.getClass(), "time", term62260);
        setField(term62205, term62205.getClass(), "lastLoginDate", term62255);
        setBooleanField(term62205, term62205.getClass(), "isWebJoin", false);
        setField(term62205, term62205.getClass(), "webLimitDate", "nVXCBYnEcg");
        setIntField(term62205, term62205.getClass(), "level", 1203278976);
        setIntField(term62205, term62205.getClass(), "reincarnationNum", 751787241);
        setField(term62205, term62205.getClass(), "exp", "fcLnKXxzfM");
        setLongField(term62205, term62205.getClass(), "point", -3581079819917173688L);
        setLongField(term62205, term62205.getClass(), "totalPoint", 1841313452085873331L);
        setIntField(term62205, term62205.getClass(), "playCount", 477748320);
        setIntField(term62205, term62205.getClass(), "multiPlayCount", 512793147);
        setIntField(term62205, term62205.getClass(), "multiWinCount", -2061386860);
        setIntField(term62205, term62205.getClass(), "requestResCount", -678230923);
        setIntField(term62205, term62205.getClass(), "acceptResCount", 2001978730);
        setIntField(term62205, term62205.getClass(), "successResCount", 835522995);
        setIntField(term62205, term62205.getClass(), "playerRating", 209416345);
        setIntField(term62205, term62205.getClass(), "highestRating", 119693843);
        setIntField(term62205, term62205.getClass(), "nameplateId", 1525937366);
        setIntField(term62205, term62205.getClass(), "frameId", 450142186);
        setIntField(term62205, term62205.getClass(), "characterId", 874917656);
        setIntField(term62205, term62205.getClass(), "trophyId", 998050776);
        setIntField(term62205, term62205.getClass(), "playedTutorialBit", -1154360532);
        setIntField(term62205, term62205.getClass(), "firstTutorialCancelNum", -1414782360);
        setIntField(term62205, term62205.getClass(), "masterTutorialCancelNum", 812774787);
        setIntField(term62205, term62205.getClass(), "totalRepertoireCount", 1955108847);
        setIntField(term62205, term62205.getClass(), "totalMapNum", 601282140);
        setLongField(term62205, term62205.getClass(), "totalHiScore", -4019650338948804968L);
        setLongField(term62205, term62205.getClass(), "totalBasicHighScore", 4836157943217062601L);
        setLongField(term62205, term62205.getClass(), "totalAdvancedHighScore", -9063283724358706942L);
        setLongField(term62205, term62205.getClass(), "totalExpertHighScore", -8579515460152917650L);
        setLongField(term62205, term62205.getClass(), "totalMasterHighScore", -3033236171719733686L);
        setIntField(term62317, term62317.getClass(), "year", 2023);
        setShortField(term62317, term62317.getClass(), "month", (short) 8);
        setShortField(term62317, term62317.getClass(), "day", (short) 30);
        setField(term62316, term62316.getClass(), "date", term62317);
        setByteField(term62321, term62321.getClass(), "hour", (byte) 9);
        setByteField(term62321, term62321.getClass(), "minute", (byte) 28);
        setByteField(term62321, term62321.getClass(), "second", (byte) 51);
        setIntField(term62321, term62321.getClass(), "nano", 285035808);
        setField(term62316, term62316.getClass(), "time", term62321);
        setField(term62205, term62205.getClass(), "eventWatchedDate", term62316);
        setIntField(term62205, term62205.getClass(), "friendCount", -1989711686);
        setBooleanField(term62205, term62205.getClass(), "isMaimai", false);
        setField(term62205, term62205.getClass(), "firstGameId", "FtyaWnfsgn");
        setField(term62205, term62205.getClass(), "firstRomVersion", "qphbpPdwrD");
        setField(term62205, term62205.getClass(), "firstDataVersion", "xHdHafzFSM");
        setIntField(term62365, term62365.getClass(), "year", 2023);
        setShortField(term62365, term62365.getClass(), "month", (short) 11);
        setShortField(term62365, term62365.getClass(), "day", (short) 25);
        setField(term62364, term62364.getClass(), "date", term62365);
        setByteField(term62369, term62369.getClass(), "hour", (byte) 1);
        setByteField(term62369, term62369.getClass(), "minute", (byte) 27);
        setByteField(term62369, term62369.getClass(), "second", (byte) 54);
        setIntField(term62369, term62369.getClass(), "nano", 382362839);
        setField(term62364, term62364.getClass(), "time", term62369);
        setField(term62205, term62205.getClass(), "firstPlayDate", term62364);
        setField(term62205, term62205.getClass(), "lastGameId", "fAsiOEKVaH");
        setField(term62205, term62205.getClass(), "lastRomVersion", "EltrILhEwT");
        setField(term62205, term62205.getClass(), "lastDataVersion", "wCcSeUJzhg");
        setIntField(term62411, term62411.getClass(), "year", 2019);
        setShortField(term62411, term62411.getClass(), "month", (short) 7);
        setShortField(term62411, term62411.getClass(), "day", (short) 3);
        setField(term62410, term62410.getClass(), "date", term62411);
        setByteField(term62415, term62415.getClass(), "hour", (byte) 1);
        setByteField(term62415, term62415.getClass(), "minute", (byte) 7);
        setByteField(term62415, term62415.getClass(), "second", (byte) 43);
        setIntField(term62415, term62415.getClass(), "nano", 632872277);
        setField(term62410, term62410.getClass(), "time", term62415);
        setField(term62205, term62205.getClass(), "lastPlayDate", term62410);
        setIntField(term62205, term62205.getClass(), "lastPlaceId", -427352130);
        setField(term62205, term62205.getClass(), "lastPlaceName", "HlVHAsOBmJ");
        setField(term62205, term62205.getClass(), "lastRegionId", "nyThJEXHhd");
        setField(term62205, term62205.getClass(), "lastRegionName", "TRfRRMMCZw");
        setField(term62205, term62205.getClass(), "lastAllNetId", "rwbfUcOMVc");
        setField(term62205, term62205.getClass(), "lastClientId", "ljTkNgJRUl");
        setField(term62203, term62203.getClass(), "user", term62205);
        setIntField(term62203, term62203.getClass(), "bgInfo", 490225359);
        setIntField(term62203, term62203.getClass(), "fieldColor", 338229726);
        setIntField(term62203, term62203.getClass(), "guideSound", -1891580978);
        setIntField(term62203, term62203.getClass(), "soundEffect", 1101260257);
        setIntField(term62203, term62203.getClass(), "guideLine", 1800400048);
        setIntField(term62203, term62203.getClass(), "speed", -1248348901);
        setIntField(term62203, term62203.getClass(), "optionSet", -808864128);
        setIntField(term62203, term62203.getClass(), "matching", -1813216452);
        setIntField(term62203, term62203.getClass(), "judgePos", 180516410);
        setIntField(term62203, term62203.getClass(), "rating", 606206987);
        setIntField(term62203, term62203.getClass(), "judgeJustice", -534930572);
        setIntField(term62203, term62203.getClass(), "judgeAttack", -748140133);
        setIntField(term62203, term62203.getClass(), "headphone", 795993216);
        setIntField(term62203, term62203.getClass(), "playerLevel", 1583601182);
        setIntField(term62203, term62203.getClass(), "successTap", -1372040155);
        setIntField(term62203, term62203.getClass(), "successExTap", 2091263178);
        setIntField(term62203, term62203.getClass(), "successSlideHold", -1726739412);
        setIntField(term62203, term62203.getClass(), "successAir", -910985376);
        setIntField(term62203, term62203.getClass(), "successFlick", 1260410174);
        setIntField(term62203, term62203.getClass(), "successSkill", -1557704101);
        setIntField(term62203, term62203.getClass(), "successTapTimbre", -764615686);
        setIntField(term62203, term62203.getClass(), "privacy", -762034217);
        term62503 = new Integer(481600552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term62503;
        callMethod(klass, "setGuideSound", argTypes, term62203, args);
    }

};


