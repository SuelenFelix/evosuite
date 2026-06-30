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

public class UserDetail_setFirstPlayDate_1897390295121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4298548;

    public UserDetail_setFirstPlayDate_1897390295121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4298552 = new Long(1624185261238942901L);
        Integer term4298615 = new Integer(-360453538);
        Integer term4298617 = new Integer(-1878105251);
        Integer term4298619 = new Integer(269733901);
        Integer term4298621 = new Integer(-736927476);
        Integer term4298623 = new Integer(1853113749);
        Integer term4298625 = new Integer(-586438860);
        ArrayList term4298613 = new ArrayList();
        ((ArrayList) term4298613).add(term4298615);
        ((ArrayList) term4298613).add(term4298617);
        ((ArrayList) term4298613).add(term4298619);
        ((ArrayList) term4298613).add(term4298621);
        ((ArrayList) term4298613).add(term4298623);
        ((ArrayList) term4298613).add(term4298625);
        Integer term4298631 = new Integer(-1602722865);
        ArrayList term4298629 = new ArrayList();
        ((ArrayList) term4298629).add(term4298631);
        term4298548 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4298550 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4298566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4298567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4298571 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4298576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4298577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4298581 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4298548, term4298548.getClass(), "id", 6659492879903489635L);
        setLongField(term4298550, term4298550.getClass(), "id", -4800797555130542815L);
        setField(term4298550, term4298550.getClass(), "extId", term4298552);
        setField(term4298550, term4298550.getClass(), "luid", "tcxZQnbIQU");
        setIntField(term4298567, term4298567.getClass(), "year", 2014);
        setShortField(term4298567, term4298567.getClass(), "month", (short) 5);
        setShortField(term4298567, term4298567.getClass(), "day", (short) 9);
        setField(term4298566, term4298566.getClass(), "date", term4298567);
        setByteField(term4298571, term4298571.getClass(), "hour", (byte) 22);
        setByteField(term4298571, term4298571.getClass(), "minute", (byte) 46);
        setByteField(term4298571, term4298571.getClass(), "second", (byte) 34);
        setIntField(term4298571, term4298571.getClass(), "nano", 808998181);
        setField(term4298566, term4298566.getClass(), "time", term4298571);
        setField(term4298550, term4298550.getClass(), "registerTime", term4298566);
        setIntField(term4298577, term4298577.getClass(), "year", 2011);
        setShortField(term4298577, term4298577.getClass(), "month", (short) 6);
        setShortField(term4298577, term4298577.getClass(), "day", (short) 6);
        setField(term4298576, term4298576.getClass(), "date", term4298577);
        setByteField(term4298581, term4298581.getClass(), "hour", (byte) 11);
        setByteField(term4298581, term4298581.getClass(), "minute", (byte) 47);
        setByteField(term4298581, term4298581.getClass(), "second", (byte) 56);
        setIntField(term4298581, term4298581.getClass(), "nano", 777975753);
        setField(term4298576, term4298576.getClass(), "time", term4298581);
        setField(term4298550, term4298550.getClass(), "accessTime", term4298576);
        setField(term4298548, term4298548.getClass(), "card", term4298550);
        setField(term4298548, term4298548.getClass(), "userName", "TuzxJmmbzZ");
        setIntField(term4298548, term4298548.getClass(), "isNetMember", -1879732648);
        setIntField(term4298548, term4298548.getClass(), "iconId", -184493145);
        setIntField(term4298548, term4298548.getClass(), "plateId", -812352572);
        setIntField(term4298548, term4298548.getClass(), "titleId", 2118562310);
        setIntField(term4298548, term4298548.getClass(), "partnerId", 563077330);
        setIntField(term4298548, term4298548.getClass(), "frameId", 595903698);
        setIntField(term4298548, term4298548.getClass(), "selectMapId", 1348476106);
        setIntField(term4298548, term4298548.getClass(), "totalAwake", -1723525848);
        setIntField(term4298548, term4298548.getClass(), "gradeRating", -2048849950);
        setIntField(term4298548, term4298548.getClass(), "musicRating", 255487864);
        setIntField(term4298548, term4298548.getClass(), "playerRating", -177349251);
        setIntField(term4298548, term4298548.getClass(), "highestRating", -234892702);
        setIntField(term4298548, term4298548.getClass(), "gradeRank", 1289145477);
        setIntField(term4298548, term4298548.getClass(), "classRank", -1345715158);
        setIntField(term4298548, term4298548.getClass(), "courseRank", 309895684);
        setField(term4298548, term4298548.getClass(), "charaSlot", term4298613);
        setField(term4298548, term4298548.getClass(), "charaLockSlot", term4298629);
        setLongField(term4298548, term4298548.getClass(), "contentBit", -9144254341622444671L);
        setIntField(term4298548, term4298548.getClass(), "playCount", -1440695322);
        setField(term4298548, term4298548.getClass(), "eventWatchedDate", "odzQQHRtUm");
        setField(term4298548, term4298548.getClass(), "lastGameId", "hgUYUyIaGf");
        setField(term4298548, term4298548.getClass(), "lastRomVersion", "jiDRiFquMX");
        setField(term4298548, term4298548.getClass(), "lastDataVersion", "EzejdJIqDB");
        setField(term4298548, term4298548.getClass(), "lastLoginDate", "AJkSDapeCk");
        setField(term4298548, term4298548.getClass(), "lastPlayDate", "BSaiOcYFJg");
        setIntField(term4298548, term4298548.getClass(), "lastPlayCredit", 666354276);
        setIntField(term4298548, term4298548.getClass(), "lastPlayMode", -262660452);
        setIntField(term4298548, term4298548.getClass(), "lastPlaceId", 1823014919);
        setField(term4298548, term4298548.getClass(), "lastPlaceName", "JjpzRdqfXm");
        setIntField(term4298548, term4298548.getClass(), "lastAllNetId", -1810612774);
        setIntField(term4298548, term4298548.getClass(), "lastRegionId", -1131453935);
        setField(term4298548, term4298548.getClass(), "lastRegionName", "NjRaHvmFUR");
        setField(term4298548, term4298548.getClass(), "lastClientId", "rohgimZyOx");
        setField(term4298548, term4298548.getClass(), "lastCountryCode", "NxPLDbJgyS");
        setIntField(term4298548, term4298548.getClass(), "lastSelectEMoney", 47584411);
        setIntField(term4298548, term4298548.getClass(), "lastSelectTicket", -730682218);
        setIntField(term4298548, term4298548.getClass(), "lastSelectCourse", -1388576659);
        setIntField(term4298548, term4298548.getClass(), "lastCountCourse", -305462383);
        setField(term4298548, term4298548.getClass(), "firstGameId", "VaJPYtNDBO");
        setField(term4298548, term4298548.getClass(), "firstRomVersion", "FsOaZePsfB");
        setField(term4298548, term4298548.getClass(), "firstDataVersion", "XDzwLTEkpP");
        setField(term4298548, term4298548.getClass(), "firstPlayDate", "MPigqZAIbd");
        setField(term4298548, term4298548.getClass(), "compatibleCmVersion", "gBsVUDCfBF");
        setField(term4298548, term4298548.getClass(), "dailyBonusDate", "QYDVSaeaKD");
        setField(term4298548, term4298548.getClass(), "dailyCourseBonusDate", "VmdquygxOl");
        setField(term4298548, term4298548.getClass(), "lastPairLoginDate", "dlvmtFUSIM");
        setField(term4298548, term4298548.getClass(), "lastTrialPlayDate", "chgLDKvyOl");
        setIntField(term4298548, term4298548.getClass(), "playVsCount", 1352349757);
        setIntField(term4298548, term4298548.getClass(), "playSyncCount", 1749050442);
        setIntField(term4298548, term4298548.getClass(), "winCount", 752949036);
        setIntField(term4298548, term4298548.getClass(), "helpCount", 1196260634);
        setIntField(term4298548, term4298548.getClass(), "comboCount", -518813351);
        setLongField(term4298548, term4298548.getClass(), "totalDeluxscore", -3050735428778061385L);
        setLongField(term4298548, term4298548.getClass(), "totalBasicDeluxscore", -947481819121166142L);
        setLongField(term4298548, term4298548.getClass(), "totalAdvancedDeluxscore", 7781972136056202494L);
        setLongField(term4298548, term4298548.getClass(), "totalExpertDeluxscore", 5429291712839445004L);
        setLongField(term4298548, term4298548.getClass(), "totalMasterDeluxscore", 2269465246196917135L);
        setLongField(term4298548, term4298548.getClass(), "totalReMasterDeluxscore", 258553628576794704L);
        setIntField(term4298548, term4298548.getClass(), "totalSync", 1865658793);
        setIntField(term4298548, term4298548.getClass(), "totalBasicSync", -1874243182);
        setIntField(term4298548, term4298548.getClass(), "totalAdvancedSync", -363369955);
        setIntField(term4298548, term4298548.getClass(), "totalExpertSync", 1797491257);
        setIntField(term4298548, term4298548.getClass(), "totalMasterSync", -1615841842);
        setIntField(term4298548, term4298548.getClass(), "totalReMasterSync", -159874843);
        setLongField(term4298548, term4298548.getClass(), "totalAchievement", 6422717875707531709L);
        setLongField(term4298548, term4298548.getClass(), "totalBasicAchievement", -7634980486652832275L);
        setLongField(term4298548, term4298548.getClass(), "totalAdvancedAchievement", -5774643122402426227L);
        setLongField(term4298548, term4298548.getClass(), "totalExpertAchievement", 389086023310750038L);
        setLongField(term4298548, term4298548.getClass(), "totalMasterAchievement", 1223941965039624965L);
        setLongField(term4298548, term4298548.getClass(), "totalReMasterAchievement", 9048192341784181745L);
        setLongField(term4298548, term4298548.getClass(), "playerOldRating", -2266581503103306327L);
        setLongField(term4298548, term4298548.getClass(), "playerNewRating", 795699713737337666L);
        setIntField(term4298548, term4298548.getClass(), "banState", 2063490693);
        setLongField(term4298548, term4298548.getClass(), "dateTime", -111957080384060862L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cOSqNGkITg";
        callMethod(klass, "setFirstPlayDate", argTypes, term4298548, args);
    }

};


