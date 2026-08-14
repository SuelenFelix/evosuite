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

public class UserDetail_setPartnerId_66515958584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243130;
     Object term243481;

    public UserDetail_setPartnerId_66515958584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term243134 = new Long(661905373566913125L);
        Integer term243197 = new Integer(-315044098);
        Integer term243199 = new Integer(2920253);
        Integer term243201 = new Integer(310113293);
        Integer term243203 = new Integer(-1668505285);
        Integer term243205 = new Integer(9043673);
        Integer term243207 = new Integer(2059842684);
        ArrayList term243195 = new ArrayList();
        ((ArrayList) term243195).add(term243197);
        ((ArrayList) term243195).add(term243199);
        ((ArrayList) term243195).add(term243201);
        ((ArrayList) term243195).add(term243203);
        ((ArrayList) term243195).add(term243205);
        ((ArrayList) term243195).add(term243207);
        ArrayList term243211 = new ArrayList();
        term243130 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term243132 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term243148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term243158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243163 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term243130, term243130.getClass(), "id", -4679644828699517549L);
        setLongField(term243132, term243132.getClass(), "id", 2580169020601601217L);
        setField(term243132, term243132.getClass(), "extId", term243134);
        setField(term243132, term243132.getClass(), "luid", "ldhzrfViik");
        setIntField(term243149, term243149.getClass(), "year", 2021);
        setShortField(term243149, term243149.getClass(), "month", (short) 4);
        setShortField(term243149, term243149.getClass(), "day", (short) 25);
        setField(term243148, term243148.getClass(), "date", term243149);
        setByteField(term243153, term243153.getClass(), "hour", (byte) 8);
        setByteField(term243153, term243153.getClass(), "minute", (byte) 14);
        setByteField(term243153, term243153.getClass(), "second", (byte) 18);
        setIntField(term243153, term243153.getClass(), "nano", 906796683);
        setField(term243148, term243148.getClass(), "time", term243153);
        setField(term243132, term243132.getClass(), "registerTime", term243148);
        setIntField(term243159, term243159.getClass(), "year", 2012);
        setShortField(term243159, term243159.getClass(), "month", (short) 7);
        setShortField(term243159, term243159.getClass(), "day", (short) 16);
        setField(term243158, term243158.getClass(), "date", term243159);
        setByteField(term243163, term243163.getClass(), "hour", (byte) 8);
        setByteField(term243163, term243163.getClass(), "minute", (byte) 3);
        setByteField(term243163, term243163.getClass(), "second", (byte) 1);
        setIntField(term243163, term243163.getClass(), "nano", 861288078);
        setField(term243158, term243158.getClass(), "time", term243163);
        setField(term243132, term243132.getClass(), "accessTime", term243158);
        setField(term243130, term243130.getClass(), "card", term243132);
        setField(term243130, term243130.getClass(), "userName", "lvGRyBZXCP");
        setIntField(term243130, term243130.getClass(), "isNetMember", 1779069426);
        setIntField(term243130, term243130.getClass(), "iconId", 1157660501);
        setIntField(term243130, term243130.getClass(), "plateId", 490025473);
        setIntField(term243130, term243130.getClass(), "titleId", 966189442);
        setIntField(term243130, term243130.getClass(), "partnerId", -322248521);
        setIntField(term243130, term243130.getClass(), "frameId", 1676012683);
        setIntField(term243130, term243130.getClass(), "selectMapId", 1173048453);
        setIntField(term243130, term243130.getClass(), "totalAwake", -702583600);
        setIntField(term243130, term243130.getClass(), "gradeRating", 1234272864);
        setIntField(term243130, term243130.getClass(), "musicRating", -2093469163);
        setIntField(term243130, term243130.getClass(), "playerRating", 2114441505);
        setIntField(term243130, term243130.getClass(), "highestRating", -283724340);
        setIntField(term243130, term243130.getClass(), "gradeRank", 146472146);
        setIntField(term243130, term243130.getClass(), "classRank", -1390379615);
        setIntField(term243130, term243130.getClass(), "courseRank", 1515664005);
        setField(term243130, term243130.getClass(), "charaSlot", term243195);
        setField(term243130, term243130.getClass(), "charaLockSlot", term243211);
        setLongField(term243130, term243130.getClass(), "contentBit", 1164093962006231114L);
        setIntField(term243130, term243130.getClass(), "playCount", 249348540);
        setField(term243130, term243130.getClass(), "eventWatchedDate", "bnLazzhSKG");
        setField(term243130, term243130.getClass(), "lastGameId", "iQmPksKQuQ");
        setField(term243130, term243130.getClass(), "lastRomVersion", "paffgSIgia");
        setField(term243130, term243130.getClass(), "lastDataVersion", "VHXyYylDte");
        setField(term243130, term243130.getClass(), "lastLoginDate", "HaapzCPUgv");
        setField(term243130, term243130.getClass(), "lastPlayDate", "nWlqfMmBHs");
        setIntField(term243130, term243130.getClass(), "lastPlayCredit", -955604562);
        setIntField(term243130, term243130.getClass(), "lastPlayMode", -1428865659);
        setIntField(term243130, term243130.getClass(), "lastPlaceId", -1810911724);
        setField(term243130, term243130.getClass(), "lastPlaceName", "plSlQRdRVX");
        setIntField(term243130, term243130.getClass(), "lastAllNetId", 2021630719);
        setIntField(term243130, term243130.getClass(), "lastRegionId", 1542129107);
        setField(term243130, term243130.getClass(), "lastRegionName", "pFmGgCMqnF");
        setField(term243130, term243130.getClass(), "lastClientId", "ZjqqDMUmbj");
        setField(term243130, term243130.getClass(), "lastCountryCode", "VXlTBlNDUC");
        setIntField(term243130, term243130.getClass(), "lastSelectEMoney", 2079013871);
        setIntField(term243130, term243130.getClass(), "lastSelectTicket", -524642037);
        setIntField(term243130, term243130.getClass(), "lastSelectCourse", 110078308);
        setIntField(term243130, term243130.getClass(), "lastCountCourse", -1029567193);
        setField(term243130, term243130.getClass(), "firstGameId", "JrRvLrAvOe");
        setField(term243130, term243130.getClass(), "firstRomVersion", "PKoYIuVvCK");
        setField(term243130, term243130.getClass(), "firstDataVersion", "cwzXkcrDLR");
        setField(term243130, term243130.getClass(), "firstPlayDate", "PWbkTRRQhH");
        setField(term243130, term243130.getClass(), "compatibleCmVersion", "wAITmXtDRl");
        setField(term243130, term243130.getClass(), "dailyBonusDate", "CftrpNyoIA");
        setField(term243130, term243130.getClass(), "dailyCourseBonusDate", "uPzBpshCha");
        setField(term243130, term243130.getClass(), "lastPairLoginDate", "hEJfxgmgVV");
        setField(term243130, term243130.getClass(), "lastTrialPlayDate", "eVLVFZDIBz");
        setIntField(term243130, term243130.getClass(), "playVsCount", 885045600);
        setIntField(term243130, term243130.getClass(), "playSyncCount", -628958232);
        setIntField(term243130, term243130.getClass(), "winCount", 261473208);
        setIntField(term243130, term243130.getClass(), "helpCount", 148074135);
        setIntField(term243130, term243130.getClass(), "comboCount", -94684581);
        setLongField(term243130, term243130.getClass(), "totalDeluxscore", 7556619086935017616L);
        setLongField(term243130, term243130.getClass(), "totalBasicDeluxscore", -1130089452489961660L);
        setLongField(term243130, term243130.getClass(), "totalAdvancedDeluxscore", -1582515935737483246L);
        setLongField(term243130, term243130.getClass(), "totalExpertDeluxscore", 2345911656665820785L);
        setLongField(term243130, term243130.getClass(), "totalMasterDeluxscore", -3891258935071861942L);
        setLongField(term243130, term243130.getClass(), "totalReMasterDeluxscore", 6654147105814872400L);
        setIntField(term243130, term243130.getClass(), "totalSync", 1046822921);
        setIntField(term243130, term243130.getClass(), "totalBasicSync", 295036576);
        setIntField(term243130, term243130.getClass(), "totalAdvancedSync", 551089243);
        setIntField(term243130, term243130.getClass(), "totalExpertSync", 308804697);
        setIntField(term243130, term243130.getClass(), "totalMasterSync", -1905953902);
        setIntField(term243130, term243130.getClass(), "totalReMasterSync", -1303343959);
        setLongField(term243130, term243130.getClass(), "totalAchievement", -7775508860110181054L);
        setLongField(term243130, term243130.getClass(), "totalBasicAchievement", -3015523661590096019L);
        setLongField(term243130, term243130.getClass(), "totalAdvancedAchievement", 5191198787082085931L);
        setLongField(term243130, term243130.getClass(), "totalExpertAchievement", 5329626808619937067L);
        setLongField(term243130, term243130.getClass(), "totalMasterAchievement", -4535630530907270200L);
        setLongField(term243130, term243130.getClass(), "totalReMasterAchievement", 5828437627170340035L);
        setLongField(term243130, term243130.getClass(), "playerOldRating", -289137492142662643L);
        setLongField(term243130, term243130.getClass(), "playerNewRating", -4311888043879490676L);
        setIntField(term243130, term243130.getClass(), "banState", 1093139582);
        setLongField(term243130, term243130.getClass(), "dateTime", -1436622564454851069L);
        term243481 = new Integer(-1533393409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term243481;
        callMethod(klass, "setPartnerId", argTypes, term243130, args);
    }

};


