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

public class UserDetail_setPartnerId_66515958585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243185;
     Object term243536;

    public UserDetail_setPartnerId_66515958585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term243189 = new Long(661905373566913125L);
        Integer term243252 = new Integer(-315044098);
        Integer term243254 = new Integer(2920253);
        Integer term243256 = new Integer(310113293);
        Integer term243258 = new Integer(-1668505285);
        Integer term243260 = new Integer(9043673);
        Integer term243262 = new Integer(2059842684);
        ArrayList term243250 = new ArrayList();
        ((ArrayList) term243250).add(term243252);
        ((ArrayList) term243250).add(term243254);
        ((ArrayList) term243250).add(term243256);
        ((ArrayList) term243250).add(term243258);
        ((ArrayList) term243250).add(term243260);
        ((ArrayList) term243250).add(term243262);
        ArrayList term243266 = new ArrayList();
        term243185 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term243187 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term243203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term243213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term243214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term243218 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term243185, term243185.getClass(), "id", -4679644828699517549L);
        setLongField(term243187, term243187.getClass(), "id", 2580169020601601217L);
        setField(term243187, term243187.getClass(), "extId", term243189);
        setField(term243187, term243187.getClass(), "luid", "ldhzrfViik");
        setIntField(term243204, term243204.getClass(), "year", 2021);
        setShortField(term243204, term243204.getClass(), "month", (short) 4);
        setShortField(term243204, term243204.getClass(), "day", (short) 25);
        setField(term243203, term243203.getClass(), "date", term243204);
        setByteField(term243208, term243208.getClass(), "hour", (byte) 8);
        setByteField(term243208, term243208.getClass(), "minute", (byte) 14);
        setByteField(term243208, term243208.getClass(), "second", (byte) 18);
        setIntField(term243208, term243208.getClass(), "nano", 906796683);
        setField(term243203, term243203.getClass(), "time", term243208);
        setField(term243187, term243187.getClass(), "registerTime", term243203);
        setIntField(term243214, term243214.getClass(), "year", 2012);
        setShortField(term243214, term243214.getClass(), "month", (short) 7);
        setShortField(term243214, term243214.getClass(), "day", (short) 16);
        setField(term243213, term243213.getClass(), "date", term243214);
        setByteField(term243218, term243218.getClass(), "hour", (byte) 8);
        setByteField(term243218, term243218.getClass(), "minute", (byte) 3);
        setByteField(term243218, term243218.getClass(), "second", (byte) 1);
        setIntField(term243218, term243218.getClass(), "nano", 861288078);
        setField(term243213, term243213.getClass(), "time", term243218);
        setField(term243187, term243187.getClass(), "accessTime", term243213);
        setField(term243185, term243185.getClass(), "card", term243187);
        setField(term243185, term243185.getClass(), "userName", "lvGRyBZXCP");
        setIntField(term243185, term243185.getClass(), "isNetMember", 1779069426);
        setIntField(term243185, term243185.getClass(), "iconId", 1157660501);
        setIntField(term243185, term243185.getClass(), "plateId", 490025473);
        setIntField(term243185, term243185.getClass(), "titleId", 966189442);
        setIntField(term243185, term243185.getClass(), "partnerId", -322248521);
        setIntField(term243185, term243185.getClass(), "frameId", 1676012683);
        setIntField(term243185, term243185.getClass(), "selectMapId", 1173048453);
        setIntField(term243185, term243185.getClass(), "totalAwake", -702583600);
        setIntField(term243185, term243185.getClass(), "gradeRating", 1234272864);
        setIntField(term243185, term243185.getClass(), "musicRating", -2093469163);
        setIntField(term243185, term243185.getClass(), "playerRating", 2114441505);
        setIntField(term243185, term243185.getClass(), "highestRating", -283724340);
        setIntField(term243185, term243185.getClass(), "gradeRank", 146472146);
        setIntField(term243185, term243185.getClass(), "classRank", -1390379615);
        setIntField(term243185, term243185.getClass(), "courseRank", 1515664005);
        setField(term243185, term243185.getClass(), "charaSlot", term243250);
        setField(term243185, term243185.getClass(), "charaLockSlot", term243266);
        setLongField(term243185, term243185.getClass(), "contentBit", 1164093962006231114L);
        setIntField(term243185, term243185.getClass(), "playCount", 249348540);
        setField(term243185, term243185.getClass(), "eventWatchedDate", "bnLazzhSKG");
        setField(term243185, term243185.getClass(), "lastGameId", "iQmPksKQuQ");
        setField(term243185, term243185.getClass(), "lastRomVersion", "paffgSIgia");
        setField(term243185, term243185.getClass(), "lastDataVersion", "VHXyYylDte");
        setField(term243185, term243185.getClass(), "lastLoginDate", "HaapzCPUgv");
        setField(term243185, term243185.getClass(), "lastPlayDate", "nWlqfMmBHs");
        setIntField(term243185, term243185.getClass(), "lastPlayCredit", -955604562);
        setIntField(term243185, term243185.getClass(), "lastPlayMode", -1428865659);
        setIntField(term243185, term243185.getClass(), "lastPlaceId", -1810911724);
        setField(term243185, term243185.getClass(), "lastPlaceName", "plSlQRdRVX");
        setIntField(term243185, term243185.getClass(), "lastAllNetId", 2021630719);
        setIntField(term243185, term243185.getClass(), "lastRegionId", 1542129107);
        setField(term243185, term243185.getClass(), "lastRegionName", "pFmGgCMqnF");
        setField(term243185, term243185.getClass(), "lastClientId", "ZjqqDMUmbj");
        setField(term243185, term243185.getClass(), "lastCountryCode", "VXlTBlNDUC");
        setIntField(term243185, term243185.getClass(), "lastSelectEMoney", 2079013871);
        setIntField(term243185, term243185.getClass(), "lastSelectTicket", -524642037);
        setIntField(term243185, term243185.getClass(), "lastSelectCourse", 110078308);
        setIntField(term243185, term243185.getClass(), "lastCountCourse", -1029567193);
        setField(term243185, term243185.getClass(), "firstGameId", "JrRvLrAvOe");
        setField(term243185, term243185.getClass(), "firstRomVersion", "PKoYIuVvCK");
        setField(term243185, term243185.getClass(), "firstDataVersion", "cwzXkcrDLR");
        setField(term243185, term243185.getClass(), "firstPlayDate", "PWbkTRRQhH");
        setField(term243185, term243185.getClass(), "compatibleCmVersion", "wAITmXtDRl");
        setField(term243185, term243185.getClass(), "dailyBonusDate", "CftrpNyoIA");
        setField(term243185, term243185.getClass(), "dailyCourseBonusDate", "uPzBpshCha");
        setField(term243185, term243185.getClass(), "lastPairLoginDate", "hEJfxgmgVV");
        setField(term243185, term243185.getClass(), "lastTrialPlayDate", "eVLVFZDIBz");
        setIntField(term243185, term243185.getClass(), "playVsCount", 885045600);
        setIntField(term243185, term243185.getClass(), "playSyncCount", -628958232);
        setIntField(term243185, term243185.getClass(), "winCount", 261473208);
        setIntField(term243185, term243185.getClass(), "helpCount", 148074135);
        setIntField(term243185, term243185.getClass(), "comboCount", -94684581);
        setLongField(term243185, term243185.getClass(), "totalDeluxscore", 7556619086935017616L);
        setLongField(term243185, term243185.getClass(), "totalBasicDeluxscore", -1130089452489961660L);
        setLongField(term243185, term243185.getClass(), "totalAdvancedDeluxscore", -1582515935737483246L);
        setLongField(term243185, term243185.getClass(), "totalExpertDeluxscore", 2345911656665820785L);
        setLongField(term243185, term243185.getClass(), "totalMasterDeluxscore", -3891258935071861942L);
        setLongField(term243185, term243185.getClass(), "totalReMasterDeluxscore", 6654147105814872400L);
        setIntField(term243185, term243185.getClass(), "totalSync", 1046822921);
        setIntField(term243185, term243185.getClass(), "totalBasicSync", 295036576);
        setIntField(term243185, term243185.getClass(), "totalAdvancedSync", 551089243);
        setIntField(term243185, term243185.getClass(), "totalExpertSync", 308804697);
        setIntField(term243185, term243185.getClass(), "totalMasterSync", -1905953902);
        setIntField(term243185, term243185.getClass(), "totalReMasterSync", -1303343959);
        setLongField(term243185, term243185.getClass(), "totalAchievement", -7775508860110181054L);
        setLongField(term243185, term243185.getClass(), "totalBasicAchievement", -3015523661590096019L);
        setLongField(term243185, term243185.getClass(), "totalAdvancedAchievement", 5191198787082085931L);
        setLongField(term243185, term243185.getClass(), "totalExpertAchievement", 5329626808619937067L);
        setLongField(term243185, term243185.getClass(), "totalMasterAchievement", -4535630530907270200L);
        setLongField(term243185, term243185.getClass(), "totalReMasterAchievement", 5828437627170340035L);
        setLongField(term243185, term243185.getClass(), "playerOldRating", -289137492142662643L);
        setLongField(term243185, term243185.getClass(), "playerNewRating", -4311888043879490676L);
        setIntField(term243185, term243185.getClass(), "banState", 1093139582);
        setLongField(term243185, term243185.getClass(), "dateTime", -1436622564454851069L);
        term243536 = new Integer(-1533393409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term243536;
        callMethod(klass, "setPartnerId", argTypes, term243185, args);
    }

};


