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

public class UserDetail_getId_6933792890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195562;

    public UserDetail_getId_6933792890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term195566 = new Long(-3279534582096707294L);
        Integer term195629 = new Integer(-697114016);
        Integer term195631 = new Integer(1991952957);
        Integer term195633 = new Integer(1877895251);
        Integer term195635 = new Integer(962916253);
        ArrayList term195627 = new ArrayList();
        ((ArrayList) term195627).add(term195629);
        ((ArrayList) term195627).add(term195631);
        ((ArrayList) term195627).add(term195633);
        ((ArrayList) term195627).add(term195635);
        Integer term195641 = new Integer(1580094069);
        Integer term195643 = new Integer(-890066143);
        Integer term195645 = new Integer(1782477754);
        ArrayList term195639 = new ArrayList();
        ((ArrayList) term195639).add(term195641);
        ((ArrayList) term195639).add(term195643);
        ((ArrayList) term195639).add(term195645);
        term195562 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term195564 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term195580 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term195581 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195585 = newInstance(Class.forName("java.time.LocalTime"));
        Object term195590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term195591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195595 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term195562, term195562.getClass(), "id", -1543242469007824295L);
        setLongField(term195564, term195564.getClass(), "id", 1277903088423737567L);
        setField(term195564, term195564.getClass(), "extId", term195566);
        setField(term195564, term195564.getClass(), "luid", "JDFnMAKNwB");
        setIntField(term195581, term195581.getClass(), "year", 2027);
        setShortField(term195581, term195581.getClass(), "month", (short) 10);
        setShortField(term195581, term195581.getClass(), "day", (short) 4);
        setField(term195580, term195580.getClass(), "date", term195581);
        setByteField(term195585, term195585.getClass(), "hour", (byte) 18);
        setByteField(term195585, term195585.getClass(), "minute", (byte) 14);
        setByteField(term195585, term195585.getClass(), "second", (byte) 14);
        setIntField(term195585, term195585.getClass(), "nano", 221363683);
        setField(term195580, term195580.getClass(), "time", term195585);
        setField(term195564, term195564.getClass(), "registerTime", term195580);
        setIntField(term195591, term195591.getClass(), "year", 2014);
        setShortField(term195591, term195591.getClass(), "month", (short) 9);
        setShortField(term195591, term195591.getClass(), "day", (short) 21);
        setField(term195590, term195590.getClass(), "date", term195591);
        setByteField(term195595, term195595.getClass(), "hour", (byte) 13);
        setByteField(term195595, term195595.getClass(), "minute", (byte) 30);
        setByteField(term195595, term195595.getClass(), "second", (byte) 57);
        setIntField(term195595, term195595.getClass(), "nano", 749136236);
        setField(term195590, term195590.getClass(), "time", term195595);
        setField(term195564, term195564.getClass(), "accessTime", term195590);
        setField(term195562, term195562.getClass(), "card", term195564);
        setField(term195562, term195562.getClass(), "userName", "genhsDDRmw");
        setIntField(term195562, term195562.getClass(), "isNetMember", 1032329767);
        setIntField(term195562, term195562.getClass(), "iconId", 1878032322);
        setIntField(term195562, term195562.getClass(), "plateId", 1027562263);
        setIntField(term195562, term195562.getClass(), "titleId", -1444808827);
        setIntField(term195562, term195562.getClass(), "partnerId", -1120740211);
        setIntField(term195562, term195562.getClass(), "frameId", 654951288);
        setIntField(term195562, term195562.getClass(), "selectMapId", 2139003917);
        setIntField(term195562, term195562.getClass(), "totalAwake", -88880251);
        setIntField(term195562, term195562.getClass(), "gradeRating", -1157773436);
        setIntField(term195562, term195562.getClass(), "musicRating", 237998332);
        setIntField(term195562, term195562.getClass(), "playerRating", 1398526783);
        setIntField(term195562, term195562.getClass(), "highestRating", -1335367347);
        setIntField(term195562, term195562.getClass(), "gradeRank", 378431284);
        setIntField(term195562, term195562.getClass(), "classRank", 1775630559);
        setIntField(term195562, term195562.getClass(), "courseRank", 1511551801);
        setField(term195562, term195562.getClass(), "charaSlot", term195627);
        setField(term195562, term195562.getClass(), "charaLockSlot", term195639);
        setLongField(term195562, term195562.getClass(), "contentBit", -794318216184174871L);
        setIntField(term195562, term195562.getClass(), "playCount", 910313590);
        setField(term195562, term195562.getClass(), "eventWatchedDate", "KOaOrbbRUs");
        setField(term195562, term195562.getClass(), "lastGameId", "KqCHuBpskl");
        setField(term195562, term195562.getClass(), "lastRomVersion", "sFaxpTrzRf");
        setField(term195562, term195562.getClass(), "lastDataVersion", "SchVjfSWCX");
        setField(term195562, term195562.getClass(), "lastLoginDate", "vSFfZsLZHr");
        setField(term195562, term195562.getClass(), "lastPlayDate", "ozTjUqRpUi");
        setIntField(term195562, term195562.getClass(), "lastPlayCredit", -877418986);
        setIntField(term195562, term195562.getClass(), "lastPlayMode", -336009454);
        setIntField(term195562, term195562.getClass(), "lastPlaceId", -63641196);
        setField(term195562, term195562.getClass(), "lastPlaceName", "gILgHfWjrp");
        setIntField(term195562, term195562.getClass(), "lastAllNetId", 1871287078);
        setIntField(term195562, term195562.getClass(), "lastRegionId", 792196604);
        setField(term195562, term195562.getClass(), "lastRegionName", "YAygBNnnul");
        setField(term195562, term195562.getClass(), "lastClientId", "uLEKeQiFEV");
        setField(term195562, term195562.getClass(), "lastCountryCode", "LLHRVyRKVK");
        setIntField(term195562, term195562.getClass(), "lastSelectEMoney", -1306447464);
        setIntField(term195562, term195562.getClass(), "lastSelectTicket", -1027761764);
        setIntField(term195562, term195562.getClass(), "lastSelectCourse", 766326251);
        setIntField(term195562, term195562.getClass(), "lastCountCourse", -557939372);
        setField(term195562, term195562.getClass(), "firstGameId", "tIfqZYRucD");
        setField(term195562, term195562.getClass(), "firstRomVersion", "cKSabLpjIK");
        setField(term195562, term195562.getClass(), "firstDataVersion", "pRVLWyIjhC");
        setField(term195562, term195562.getClass(), "firstPlayDate", "AJxYoXFJNY");
        setField(term195562, term195562.getClass(), "compatibleCmVersion", "oBsIEyGozN");
        setField(term195562, term195562.getClass(), "dailyBonusDate", "SlYQtEzucG");
        setField(term195562, term195562.getClass(), "dailyCourseBonusDate", "ZBFeHlboAy");
        setField(term195562, term195562.getClass(), "lastPairLoginDate", "afGJMrmxjH");
        setField(term195562, term195562.getClass(), "lastTrialPlayDate", "ZpfhRlkkoy");
        setIntField(term195562, term195562.getClass(), "playVsCount", 924802684);
        setIntField(term195562, term195562.getClass(), "playSyncCount", 647650611);
        setIntField(term195562, term195562.getClass(), "winCount", 1830557897);
        setIntField(term195562, term195562.getClass(), "helpCount", -1998060372);
        setIntField(term195562, term195562.getClass(), "comboCount", 567825669);
        setLongField(term195562, term195562.getClass(), "totalDeluxscore", -9193003593128428116L);
        setLongField(term195562, term195562.getClass(), "totalBasicDeluxscore", 3580621595897088737L);
        setLongField(term195562, term195562.getClass(), "totalAdvancedDeluxscore", -5485319817298284150L);
        setLongField(term195562, term195562.getClass(), "totalExpertDeluxscore", 5062506679811364885L);
        setLongField(term195562, term195562.getClass(), "totalMasterDeluxscore", 72202288797284860L);
        setLongField(term195562, term195562.getClass(), "totalReMasterDeluxscore", -4407620542485515440L);
        setIntField(term195562, term195562.getClass(), "totalSync", -119885836);
        setIntField(term195562, term195562.getClass(), "totalBasicSync", 698701205);
        setIntField(term195562, term195562.getClass(), "totalAdvancedSync", 733986936);
        setIntField(term195562, term195562.getClass(), "totalExpertSync", -1752207831);
        setIntField(term195562, term195562.getClass(), "totalMasterSync", -1175000933);
        setIntField(term195562, term195562.getClass(), "totalReMasterSync", -1090683004);
        setLongField(term195562, term195562.getClass(), "totalAchievement", 2919288170476234454L);
        setLongField(term195562, term195562.getClass(), "totalBasicAchievement", -8968540338845961317L);
        setLongField(term195562, term195562.getClass(), "totalAdvancedAchievement", 5563787097561840935L);
        setLongField(term195562, term195562.getClass(), "totalExpertAchievement", 998034108065079742L);
        setLongField(term195562, term195562.getClass(), "totalMasterAchievement", -9090646855744689070L);
        setLongField(term195562, term195562.getClass(), "totalReMasterAchievement", -363939148082189305L);
        setLongField(term195562, term195562.getClass(), "playerOldRating", -1604620902518591106L);
        setLongField(term195562, term195562.getClass(), "playerNewRating", 7040225765523952201L);
        setIntField(term195562, term195562.getClass(), "banState", 1077547795);
        setLongField(term195562, term195562.getClass(), "dateTime", -2781983210471273168L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term195562, args);
    }

};


