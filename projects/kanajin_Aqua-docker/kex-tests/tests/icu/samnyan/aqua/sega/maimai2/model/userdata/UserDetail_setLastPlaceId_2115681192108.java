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

public class UserDetail_setLastPlaceId_2115681192108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256388;
     Object term256749;

    public UserDetail_setLastPlaceId_2115681192108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term256392 = new Long(-4693900822622913579L);
        Integer term256455 = new Integer(-143522206);
        Integer term256457 = new Integer(70726858);
        ArrayList term256453 = new ArrayList();
        ((ArrayList) term256453).add(term256455);
        ((ArrayList) term256453).add(term256457);
        Integer term256463 = new Integer(-1883665560);
        Integer term256465 = new Integer(-1304361419);
        Integer term256467 = new Integer(-1253063552);
        Integer term256469 = new Integer(11874750);
        Integer term256471 = new Integer(-920088882);
        Integer term256473 = new Integer(-1963888580);
        Integer term256475 = new Integer(885969140);
        Integer term256477 = new Integer(-573115224);
        Integer term256479 = new Integer(716083613);
        ArrayList term256461 = new ArrayList();
        ((ArrayList) term256461).add(term256463);
        ((ArrayList) term256461).add(term256465);
        ((ArrayList) term256461).add(term256467);
        ((ArrayList) term256461).add(term256469);
        ((ArrayList) term256461).add(term256471);
        ((ArrayList) term256461).add(term256473);
        ((ArrayList) term256461).add(term256475);
        ((ArrayList) term256461).add(term256477);
        ((ArrayList) term256461).add(term256479);
        term256388 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term256390 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term256406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term256416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256421 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term256388, term256388.getClass(), "id", -5944828074932692757L);
        setLongField(term256390, term256390.getClass(), "id", 5678707623297394450L);
        setField(term256390, term256390.getClass(), "extId", term256392);
        setField(term256390, term256390.getClass(), "luid", "keaFywfzbU");
        setIntField(term256407, term256407.getClass(), "year", 2023);
        setShortField(term256407, term256407.getClass(), "month", (short) 3);
        setShortField(term256407, term256407.getClass(), "day", (short) 15);
        setField(term256406, term256406.getClass(), "date", term256407);
        setByteField(term256411, term256411.getClass(), "hour", (byte) 9);
        setByteField(term256411, term256411.getClass(), "minute", (byte) 10);
        setByteField(term256411, term256411.getClass(), "second", (byte) 38);
        setIntField(term256411, term256411.getClass(), "nano", 695302180);
        setField(term256406, term256406.getClass(), "time", term256411);
        setField(term256390, term256390.getClass(), "registerTime", term256406);
        setIntField(term256417, term256417.getClass(), "year", 2019);
        setShortField(term256417, term256417.getClass(), "month", (short) 12);
        setShortField(term256417, term256417.getClass(), "day", (short) 29);
        setField(term256416, term256416.getClass(), "date", term256417);
        setByteField(term256421, term256421.getClass(), "hour", (byte) 19);
        setByteField(term256421, term256421.getClass(), "minute", (byte) 43);
        setByteField(term256421, term256421.getClass(), "second", (byte) 47);
        setIntField(term256421, term256421.getClass(), "nano", 957440346);
        setField(term256416, term256416.getClass(), "time", term256421);
        setField(term256390, term256390.getClass(), "accessTime", term256416);
        setField(term256388, term256388.getClass(), "card", term256390);
        setField(term256388, term256388.getClass(), "userName", "ADlubZpgSu");
        setIntField(term256388, term256388.getClass(), "isNetMember", 1038645253);
        setIntField(term256388, term256388.getClass(), "iconId", 1874684683);
        setIntField(term256388, term256388.getClass(), "plateId", -65922279);
        setIntField(term256388, term256388.getClass(), "titleId", -248288256);
        setIntField(term256388, term256388.getClass(), "partnerId", -2041452525);
        setIntField(term256388, term256388.getClass(), "frameId", 1983098908);
        setIntField(term256388, term256388.getClass(), "selectMapId", 301824784);
        setIntField(term256388, term256388.getClass(), "totalAwake", 857558066);
        setIntField(term256388, term256388.getClass(), "gradeRating", -6342723);
        setIntField(term256388, term256388.getClass(), "musicRating", 1756918414);
        setIntField(term256388, term256388.getClass(), "playerRating", 608595543);
        setIntField(term256388, term256388.getClass(), "highestRating", 1398716212);
        setIntField(term256388, term256388.getClass(), "gradeRank", -1480289183);
        setIntField(term256388, term256388.getClass(), "classRank", -1549445595);
        setIntField(term256388, term256388.getClass(), "courseRank", -489905003);
        setField(term256388, term256388.getClass(), "charaSlot", term256453);
        setField(term256388, term256388.getClass(), "charaLockSlot", term256461);
        setLongField(term256388, term256388.getClass(), "contentBit", 832340031179054078L);
        setIntField(term256388, term256388.getClass(), "playCount", 734985387);
        setField(term256388, term256388.getClass(), "eventWatchedDate", "MzSJDcOtLM");
        setField(term256388, term256388.getClass(), "lastGameId", "GsuZHmLIYX");
        setField(term256388, term256388.getClass(), "lastRomVersion", "UnZGDLrFWQ");
        setField(term256388, term256388.getClass(), "lastDataVersion", "zKUSldypzp");
        setField(term256388, term256388.getClass(), "lastLoginDate", "DZyNInpLTr");
        setField(term256388, term256388.getClass(), "lastPlayDate", "RPeGSfMGcA");
        setIntField(term256388, term256388.getClass(), "lastPlayCredit", -1589839648);
        setIntField(term256388, term256388.getClass(), "lastPlayMode", 797967545);
        setIntField(term256388, term256388.getClass(), "lastPlaceId", 1752785510);
        setField(term256388, term256388.getClass(), "lastPlaceName", "dhopMnOrLY");
        setIntField(term256388, term256388.getClass(), "lastAllNetId", -2139567650);
        setIntField(term256388, term256388.getClass(), "lastRegionId", 1941649114);
        setField(term256388, term256388.getClass(), "lastRegionName", "wsnRKetsGI");
        setField(term256388, term256388.getClass(), "lastClientId", "QLytkOkJsd");
        setField(term256388, term256388.getClass(), "lastCountryCode", "CExchqIigF");
        setIntField(term256388, term256388.getClass(), "lastSelectEMoney", -287321760);
        setIntField(term256388, term256388.getClass(), "lastSelectTicket", -1313321034);
        setIntField(term256388, term256388.getClass(), "lastSelectCourse", 131693432);
        setIntField(term256388, term256388.getClass(), "lastCountCourse", -884613349);
        setField(term256388, term256388.getClass(), "firstGameId", "fNWyHowvJR");
        setField(term256388, term256388.getClass(), "firstRomVersion", "synCfIOSuZ");
        setField(term256388, term256388.getClass(), "firstDataVersion", "nYiDbDJWoP");
        setField(term256388, term256388.getClass(), "firstPlayDate", "dytNsIZeKc");
        setField(term256388, term256388.getClass(), "compatibleCmVersion", "VVfxhVBDZu");
        setField(term256388, term256388.getClass(), "dailyBonusDate", "eeNpiPOYFc");
        setField(term256388, term256388.getClass(), "dailyCourseBonusDate", "ERUptLbOom");
        setField(term256388, term256388.getClass(), "lastPairLoginDate", "bBEslIUoPI");
        setField(term256388, term256388.getClass(), "lastTrialPlayDate", "YDRVeGkKiv");
        setIntField(term256388, term256388.getClass(), "playVsCount", -227022389);
        setIntField(term256388, term256388.getClass(), "playSyncCount", -780249262);
        setIntField(term256388, term256388.getClass(), "winCount", -1608693876);
        setIntField(term256388, term256388.getClass(), "helpCount", 1682226516);
        setIntField(term256388, term256388.getClass(), "comboCount", 982039024);
        setLongField(term256388, term256388.getClass(), "totalDeluxscore", 434148518094474889L);
        setLongField(term256388, term256388.getClass(), "totalBasicDeluxscore", 5822613783527086891L);
        setLongField(term256388, term256388.getClass(), "totalAdvancedDeluxscore", -856877156735058691L);
        setLongField(term256388, term256388.getClass(), "totalExpertDeluxscore", 7031867735081003144L);
        setLongField(term256388, term256388.getClass(), "totalMasterDeluxscore", 869924788078913714L);
        setLongField(term256388, term256388.getClass(), "totalReMasterDeluxscore", -2161934513084385143L);
        setIntField(term256388, term256388.getClass(), "totalSync", 1025928124);
        setIntField(term256388, term256388.getClass(), "totalBasicSync", 1080394714);
        setIntField(term256388, term256388.getClass(), "totalAdvancedSync", -1472341235);
        setIntField(term256388, term256388.getClass(), "totalExpertSync", -1801361943);
        setIntField(term256388, term256388.getClass(), "totalMasterSync", 596985150);
        setIntField(term256388, term256388.getClass(), "totalReMasterSync", -1036612528);
        setLongField(term256388, term256388.getClass(), "totalAchievement", 4833845969834145978L);
        setLongField(term256388, term256388.getClass(), "totalBasicAchievement", 5445927853312310765L);
        setLongField(term256388, term256388.getClass(), "totalAdvancedAchievement", -8710795146223428235L);
        setLongField(term256388, term256388.getClass(), "totalExpertAchievement", -4467843392959422501L);
        setLongField(term256388, term256388.getClass(), "totalMasterAchievement", 8961367217118588250L);
        setLongField(term256388, term256388.getClass(), "totalReMasterAchievement", 212851134038142536L);
        setLongField(term256388, term256388.getClass(), "playerOldRating", 5380287243236542966L);
        setLongField(term256388, term256388.getClass(), "playerNewRating", 4157917806167586971L);
        setIntField(term256388, term256388.getClass(), "banState", 678116826);
        setLongField(term256388, term256388.getClass(), "dateTime", 2710884008767263028L);
        term256749 = new Integer(-968589797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term256749;
        callMethod(klass, "setLastPlaceId", argTypes, term256388, args);
    }

};


