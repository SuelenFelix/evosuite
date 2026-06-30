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

public class UserAct_getParam2_7816402427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4012;

    public UserAct_getParam2_7816402427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4018 = new Long(6811161968424632369L);
        Integer term4081 = new Integer(-184153539);
        Integer term4083 = new Integer(493620644);
        Integer term4085 = new Integer(1328271830);
        ArrayList term4079 = new ArrayList();
        ((ArrayList) term4079).add(term4081);
        ((ArrayList) term4079).add(term4083);
        ((ArrayList) term4079).add(term4085);
        Integer term4091 = new Integer(1596070772);
        ArrayList term4089 = new ArrayList();
        ((ArrayList) term4089).add(term4091);
        term4012 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term4014 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4016 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4037 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4047 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4012, term4012.getClass(), "id", 8802866251294305945L);
        setLongField(term4014, term4014.getClass(), "id", 4513004407927379358L);
        setLongField(term4016, term4016.getClass(), "id", -7115418542247301000L);
        setField(term4016, term4016.getClass(), "extId", term4018);
        setField(term4016, term4016.getClass(), "luid", "FPvxVzzSvD");
        setIntField(term4033, term4033.getClass(), "year", 2012);
        setShortField(term4033, term4033.getClass(), "month", (short) 2);
        setShortField(term4033, term4033.getClass(), "day", (short) 19);
        setField(term4032, term4032.getClass(), "date", term4033);
        setByteField(term4037, term4037.getClass(), "hour", (byte) 8);
        setByteField(term4037, term4037.getClass(), "minute", (byte) 4);
        setByteField(term4037, term4037.getClass(), "second", (byte) 43);
        setIntField(term4037, term4037.getClass(), "nano", 114930008);
        setField(term4032, term4032.getClass(), "time", term4037);
        setField(term4016, term4016.getClass(), "registerTime", term4032);
        setIntField(term4043, term4043.getClass(), "year", 2017);
        setShortField(term4043, term4043.getClass(), "month", (short) 6);
        setShortField(term4043, term4043.getClass(), "day", (short) 8);
        setField(term4042, term4042.getClass(), "date", term4043);
        setByteField(term4047, term4047.getClass(), "hour", (byte) 0);
        setByteField(term4047, term4047.getClass(), "minute", (byte) 18);
        setByteField(term4047, term4047.getClass(), "second", (byte) 55);
        setIntField(term4047, term4047.getClass(), "nano", 680586717);
        setField(term4042, term4042.getClass(), "time", term4047);
        setField(term4016, term4016.getClass(), "accessTime", term4042);
        setField(term4014, term4014.getClass(), "card", term4016);
        setField(term4014, term4014.getClass(), "userName", "WHcwFgsGFC");
        setIntField(term4014, term4014.getClass(), "isNetMember", -1464172784);
        setIntField(term4014, term4014.getClass(), "iconId", 32185364);
        setIntField(term4014, term4014.getClass(), "plateId", 1768204942);
        setIntField(term4014, term4014.getClass(), "titleId", 1252951645);
        setIntField(term4014, term4014.getClass(), "partnerId", 574481092);
        setIntField(term4014, term4014.getClass(), "frameId", -310528004);
        setIntField(term4014, term4014.getClass(), "selectMapId", -634976996);
        setIntField(term4014, term4014.getClass(), "totalAwake", -1015274146);
        setIntField(term4014, term4014.getClass(), "gradeRating", -49052672);
        setIntField(term4014, term4014.getClass(), "musicRating", 339372704);
        setIntField(term4014, term4014.getClass(), "playerRating", -851097944);
        setIntField(term4014, term4014.getClass(), "highestRating", 803925431);
        setIntField(term4014, term4014.getClass(), "gradeRank", 76929641);
        setIntField(term4014, term4014.getClass(), "classRank", -2003192918);
        setIntField(term4014, term4014.getClass(), "courseRank", -1362856620);
        setField(term4014, term4014.getClass(), "charaSlot", term4079);
        setField(term4014, term4014.getClass(), "charaLockSlot", term4089);
        setLongField(term4014, term4014.getClass(), "contentBit", 8034714140377562739L);
        setIntField(term4014, term4014.getClass(), "playCount", -1835839814);
        setField(term4014, term4014.getClass(), "eventWatchedDate", "HzqpegHiRq");
        setField(term4014, term4014.getClass(), "lastGameId", "jwsfVjMoJT");
        setField(term4014, term4014.getClass(), "lastRomVersion", "ZfdXfCCFDf");
        setField(term4014, term4014.getClass(), "lastDataVersion", "MwwjNtdOFT");
        setField(term4014, term4014.getClass(), "lastLoginDate", "VYkqXKVlAJ");
        setField(term4014, term4014.getClass(), "lastPlayDate", "XkIoWJRNwN");
        setIntField(term4014, term4014.getClass(), "lastPlayCredit", -1404350380);
        setIntField(term4014, term4014.getClass(), "lastPlayMode", -2013924238);
        setIntField(term4014, term4014.getClass(), "lastPlaceId", 579006268);
        setField(term4014, term4014.getClass(), "lastPlaceName", "aNWLJdrZMq");
        setIntField(term4014, term4014.getClass(), "lastAllNetId", -1694747156);
        setIntField(term4014, term4014.getClass(), "lastRegionId", 1466373988);
        setField(term4014, term4014.getClass(), "lastRegionName", "HHmNoYxIGj");
        setField(term4014, term4014.getClass(), "lastClientId", "PtirvZmsGt");
        setField(term4014, term4014.getClass(), "lastCountryCode", "HWkpTmtlrc");
        setIntField(term4014, term4014.getClass(), "lastSelectEMoney", -358526505);
        setIntField(term4014, term4014.getClass(), "lastSelectTicket", 1843268026);
        setIntField(term4014, term4014.getClass(), "lastSelectCourse", 954660603);
        setIntField(term4014, term4014.getClass(), "lastCountCourse", -1351605385);
        setField(term4014, term4014.getClass(), "firstGameId", "hMmaoREuCK");
        setField(term4014, term4014.getClass(), "firstRomVersion", "VeDtgDzGAN");
        setField(term4014, term4014.getClass(), "firstDataVersion", "aWYOWZFyaX");
        setField(term4014, term4014.getClass(), "firstPlayDate", "BRIVNtfUWU");
        setField(term4014, term4014.getClass(), "compatibleCmVersion", "DbiCVtPPCT");
        setField(term4014, term4014.getClass(), "dailyBonusDate", "WzFopsaDuG");
        setField(term4014, term4014.getClass(), "dailyCourseBonusDate", "PapWxkhEWe");
        setField(term4014, term4014.getClass(), "lastPairLoginDate", "smnHEqRFRx");
        setField(term4014, term4014.getClass(), "lastTrialPlayDate", "XYtryyobou");
        setIntField(term4014, term4014.getClass(), "playVsCount", 278355793);
        setIntField(term4014, term4014.getClass(), "playSyncCount", -310648604);
        setIntField(term4014, term4014.getClass(), "winCount", -648200466);
        setIntField(term4014, term4014.getClass(), "helpCount", 2007134147);
        setIntField(term4014, term4014.getClass(), "comboCount", 993388358);
        setLongField(term4014, term4014.getClass(), "totalDeluxscore", -2924531382671518368L);
        setLongField(term4014, term4014.getClass(), "totalBasicDeluxscore", -3948863953565024517L);
        setLongField(term4014, term4014.getClass(), "totalAdvancedDeluxscore", -6587807377747738663L);
        setLongField(term4014, term4014.getClass(), "totalExpertDeluxscore", -6301101997917060727L);
        setLongField(term4014, term4014.getClass(), "totalMasterDeluxscore", 8166095254618543564L);
        setLongField(term4014, term4014.getClass(), "totalReMasterDeluxscore", -4598158870068953328L);
        setIntField(term4014, term4014.getClass(), "totalSync", -765191335);
        setIntField(term4014, term4014.getClass(), "totalBasicSync", -1697741155);
        setIntField(term4014, term4014.getClass(), "totalAdvancedSync", 1295839803);
        setIntField(term4014, term4014.getClass(), "totalExpertSync", -1891015523);
        setIntField(term4014, term4014.getClass(), "totalMasterSync", -1560631747);
        setIntField(term4014, term4014.getClass(), "totalReMasterSync", 1215150180);
        setLongField(term4014, term4014.getClass(), "totalAchievement", 138235087558060686L);
        setLongField(term4014, term4014.getClass(), "totalBasicAchievement", 5381386339318883012L);
        setLongField(term4014, term4014.getClass(), "totalAdvancedAchievement", -1333707622307134180L);
        setLongField(term4014, term4014.getClass(), "totalExpertAchievement", -4360569253593381888L);
        setLongField(term4014, term4014.getClass(), "totalMasterAchievement", 1457594663983990440L);
        setLongField(term4014, term4014.getClass(), "totalReMasterAchievement", 3452833434644634217L);
        setLongField(term4014, term4014.getClass(), "playerOldRating", -8603648071751666348L);
        setLongField(term4014, term4014.getClass(), "playerNewRating", -7884871963229073324L);
        setIntField(term4014, term4014.getClass(), "banState", -1422859977);
        setLongField(term4014, term4014.getClass(), "dateTime", -8649738738252714180L);
        setField(term4012, term4012.getClass(), "user", term4014);
        setIntField(term4012, term4012.getClass(), "kind", -1972436591);
        setIntField(term4012, term4012.getClass(), "activityId", 68922753);
        setLongField(term4012, term4012.getClass(), "sortNumber", -7278883608542636188L);
        setIntField(term4012, term4012.getClass(), "param1", -220791533);
        setIntField(term4012, term4012.getClass(), "param2", 1741500243);
        setIntField(term4012, term4012.getClass(), "param3", -2070466617);
        setIntField(term4012, term4012.getClass(), "param4", -1127721881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam2", argTypes, term4012, args);
    }

};


