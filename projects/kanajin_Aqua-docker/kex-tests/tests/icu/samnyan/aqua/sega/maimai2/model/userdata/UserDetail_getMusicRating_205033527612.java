package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getMusicRating_205033527612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4236300;

    public UserDetail_getMusicRating_205033527612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4236304 = new Long(-3746020777641223593L);
        Integer term4236367 = new Integer(81788522);
        Integer term4236369 = new Integer(-1593886817);
        Integer term4236371 = new Integer(1038801057);
        ArrayList term4236365 = new ArrayList();
        ((ArrayList) term4236365).add(term4236367);
        ((ArrayList) term4236365).add(term4236369);
        ((ArrayList) term4236365).add(term4236371);
        Integer term4236377 = new Integer(-382750942);
        Integer term4236379 = new Integer(753064895);
        Integer term4236381 = new Integer(-1315883617);
        Integer term4236383 = new Integer(2097293687);
        Integer term4236385 = new Integer(-1521321707);
        Integer term4236387 = new Integer(2016028680);
        Integer term4236389 = new Integer(-551041121);
        Integer term4236391 = new Integer(762083421);
        Integer term4236393 = new Integer(1147575851);
        ArrayList term4236375 = new ArrayList();
        ((ArrayList) term4236375).add(term4236377);
        ((ArrayList) term4236375).add(term4236379);
        ((ArrayList) term4236375).add(term4236381);
        ((ArrayList) term4236375).add(term4236383);
        ((ArrayList) term4236375).add(term4236385);
        ((ArrayList) term4236375).add(term4236387);
        ((ArrayList) term4236375).add(term4236389);
        ((ArrayList) term4236375).add(term4236391);
        ((ArrayList) term4236375).add(term4236393);
        term4236300 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4236302 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4236318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4236319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4236323 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4236328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4236329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4236333 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4236300, term4236300.getClass(), "id", -5468608543520579139L);
        setLongField(term4236302, term4236302.getClass(), "id", 8059025082120716421L);
        setField(term4236302, term4236302.getClass(), "extId", term4236304);
        setField(term4236302, term4236302.getClass(), "luid", "YSjQumHUyL");
        setIntField(term4236319, term4236319.getClass(), "year", 2023);
        setShortField(term4236319, term4236319.getClass(), "month", (short) 1);
        setShortField(term4236319, term4236319.getClass(), "day", (short) 8);
        setField(term4236318, term4236318.getClass(), "date", term4236319);
        setByteField(term4236323, term4236323.getClass(), "hour", (byte) 4);
        setByteField(term4236323, term4236323.getClass(), "minute", (byte) 45);
        setByteField(term4236323, term4236323.getClass(), "second", (byte) 17);
        setIntField(term4236323, term4236323.getClass(), "nano", 986281897);
        setField(term4236318, term4236318.getClass(), "time", term4236323);
        setField(term4236302, term4236302.getClass(), "registerTime", term4236318);
        setIntField(term4236329, term4236329.getClass(), "year", 2020);
        setShortField(term4236329, term4236329.getClass(), "month", (short) 9);
        setShortField(term4236329, term4236329.getClass(), "day", (short) 22);
        setField(term4236328, term4236328.getClass(), "date", term4236329);
        setByteField(term4236333, term4236333.getClass(), "hour", (byte) 23);
        setByteField(term4236333, term4236333.getClass(), "minute", (byte) 48);
        setByteField(term4236333, term4236333.getClass(), "second", (byte) 42);
        setIntField(term4236333, term4236333.getClass(), "nano", 77546007);
        setField(term4236328, term4236328.getClass(), "time", term4236333);
        setField(term4236302, term4236302.getClass(), "accessTime", term4236328);
        setField(term4236300, term4236300.getClass(), "card", term4236302);
        setField(term4236300, term4236300.getClass(), "userName", "XazfBsCzUt");
        setIntField(term4236300, term4236300.getClass(), "isNetMember", -1986775031);
        setIntField(term4236300, term4236300.getClass(), "iconId", 1888758424);
        setIntField(term4236300, term4236300.getClass(), "plateId", 154548314);
        setIntField(term4236300, term4236300.getClass(), "titleId", 1778728728);
        setIntField(term4236300, term4236300.getClass(), "partnerId", 937550354);
        setIntField(term4236300, term4236300.getClass(), "frameId", 331822502);
        setIntField(term4236300, term4236300.getClass(), "selectMapId", -1748184768);
        setIntField(term4236300, term4236300.getClass(), "totalAwake", -1759197979);
        setIntField(term4236300, term4236300.getClass(), "gradeRating", -500626508);
        setIntField(term4236300, term4236300.getClass(), "musicRating", -325004224);
        setIntField(term4236300, term4236300.getClass(), "playerRating", -1983969262);
        setIntField(term4236300, term4236300.getClass(), "highestRating", -1512981859);
        setIntField(term4236300, term4236300.getClass(), "gradeRank", 266161848);
        setIntField(term4236300, term4236300.getClass(), "classRank", 948748549);
        setIntField(term4236300, term4236300.getClass(), "courseRank", -1731830954);
        setField(term4236300, term4236300.getClass(), "charaSlot", term4236365);
        setField(term4236300, term4236300.getClass(), "charaLockSlot", term4236375);
        setLongField(term4236300, term4236300.getClass(), "contentBit", 6714128076835475006L);
        setIntField(term4236300, term4236300.getClass(), "playCount", -645567978);
        setField(term4236300, term4236300.getClass(), "eventWatchedDate", "QDGlPJJBiL");
        setField(term4236300, term4236300.getClass(), "lastGameId", "grLraSSXNE");
        setField(term4236300, term4236300.getClass(), "lastRomVersion", "QeGqxRhWwB");
        setField(term4236300, term4236300.getClass(), "lastDataVersion", "htuyIDnOqS");
        setField(term4236300, term4236300.getClass(), "lastLoginDate", "NMDOJiKQQa");
        setField(term4236300, term4236300.getClass(), "lastPlayDate", "bUzgFaHznl");
        setIntField(term4236300, term4236300.getClass(), "lastPlayCredit", -758234000);
        setIntField(term4236300, term4236300.getClass(), "lastPlayMode", 16261183);
        setIntField(term4236300, term4236300.getClass(), "lastPlaceId", 229332513);
        setField(term4236300, term4236300.getClass(), "lastPlaceName", "IjGZNGVSif");
        setIntField(term4236300, term4236300.getClass(), "lastAllNetId", -790228974);
        setIntField(term4236300, term4236300.getClass(), "lastRegionId", -1551020074);
        setField(term4236300, term4236300.getClass(), "lastRegionName", "QOmOFNojkp");
        setField(term4236300, term4236300.getClass(), "lastClientId", "oPPsmRLKoz");
        setField(term4236300, term4236300.getClass(), "lastCountryCode", "bAGYDbwaQf");
        setIntField(term4236300, term4236300.getClass(), "lastSelectEMoney", -143333069);
        setIntField(term4236300, term4236300.getClass(), "lastSelectTicket", 1030414557);
        setIntField(term4236300, term4236300.getClass(), "lastSelectCourse", -1041606736);
        setIntField(term4236300, term4236300.getClass(), "lastCountCourse", 1147364853);
        setField(term4236300, term4236300.getClass(), "firstGameId", "vBnUEGvyum");
        setField(term4236300, term4236300.getClass(), "firstRomVersion", "pNDPvXvxFW");
        setField(term4236300, term4236300.getClass(), "firstDataVersion", "hzcYilMqwT");
        setField(term4236300, term4236300.getClass(), "firstPlayDate", "uZIjHLQzAN");
        setField(term4236300, term4236300.getClass(), "compatibleCmVersion", "szcEctLGIs");
        setField(term4236300, term4236300.getClass(), "dailyBonusDate", "pTVrTUEaVy");
        setField(term4236300, term4236300.getClass(), "dailyCourseBonusDate", "HDCRfnJxZy");
        setField(term4236300, term4236300.getClass(), "lastPairLoginDate", "iXbtYdACJk");
        setField(term4236300, term4236300.getClass(), "lastTrialPlayDate", "yJhHAhsJTP");
        setIntField(term4236300, term4236300.getClass(), "playVsCount", 1587155130);
        setIntField(term4236300, term4236300.getClass(), "playSyncCount", -1353098677);
        setIntField(term4236300, term4236300.getClass(), "winCount", -957048540);
        setIntField(term4236300, term4236300.getClass(), "helpCount", -164595577);
        setIntField(term4236300, term4236300.getClass(), "comboCount", -836548336);
        setLongField(term4236300, term4236300.getClass(), "totalDeluxscore", -8956032100102426379L);
        setLongField(term4236300, term4236300.getClass(), "totalBasicDeluxscore", 5890904774031166771L);
        setLongField(term4236300, term4236300.getClass(), "totalAdvancedDeluxscore", -4152114631409525071L);
        setLongField(term4236300, term4236300.getClass(), "totalExpertDeluxscore", 6389905777259939816L);
        setLongField(term4236300, term4236300.getClass(), "totalMasterDeluxscore", -8703901635406751068L);
        setLongField(term4236300, term4236300.getClass(), "totalReMasterDeluxscore", 7339705690546834429L);
        setIntField(term4236300, term4236300.getClass(), "totalSync", -730874677);
        setIntField(term4236300, term4236300.getClass(), "totalBasicSync", -1932079190);
        setIntField(term4236300, term4236300.getClass(), "totalAdvancedSync", 1946445535);
        setIntField(term4236300, term4236300.getClass(), "totalExpertSync", -2052298005);
        setIntField(term4236300, term4236300.getClass(), "totalMasterSync", -672181285);
        setIntField(term4236300, term4236300.getClass(), "totalReMasterSync", 189495991);
        setLongField(term4236300, term4236300.getClass(), "totalAchievement", -6193646488188972952L);
        setLongField(term4236300, term4236300.getClass(), "totalBasicAchievement", -3877560507309649742L);
        setLongField(term4236300, term4236300.getClass(), "totalAdvancedAchievement", -8661398866856208592L);
        setLongField(term4236300, term4236300.getClass(), "totalExpertAchievement", 466316073360264293L);
        setLongField(term4236300, term4236300.getClass(), "totalMasterAchievement", 3698828880225463527L);
        setLongField(term4236300, term4236300.getClass(), "totalReMasterAchievement", -1853587984742048169L);
        setLongField(term4236300, term4236300.getClass(), "playerOldRating", 7178253809136271257L);
        setLongField(term4236300, term4236300.getClass(), "playerNewRating", -2567994980924403530L);
        setIntField(term4236300, term4236300.getClass(), "banState", -858023671);
        setLongField(term4236300, term4236300.getClass(), "dateTime", -7787738448873445102L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicRating", argTypes, term4236300, args);
    }

};


