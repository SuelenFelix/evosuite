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

public class UserDetail_setTotalExpertSync_1340617051141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4310030;
     Object term4310387;

    public UserDetail_setTotalExpertSync_1340617051141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4310034 = new Long(1022195053841077055L);
        Integer term4310097 = new Integer(-17478491);
        Integer term4310099 = new Integer(-1929569879);
        Integer term4310101 = new Integer(474343023);
        Integer term4310103 = new Integer(-1990377854);
        ArrayList term4310095 = new ArrayList();
        ((ArrayList) term4310095).add(term4310097);
        ((ArrayList) term4310095).add(term4310099);
        ((ArrayList) term4310095).add(term4310101);
        ((ArrayList) term4310095).add(term4310103);
        Integer term4310109 = new Integer(-1737041392);
        Integer term4310111 = new Integer(1664920870);
        Integer term4310113 = new Integer(921567349);
        Integer term4310115 = new Integer(495324354);
        Integer term4310117 = new Integer(974817743);
        ArrayList term4310107 = new ArrayList();
        ((ArrayList) term4310107).add(term4310109);
        ((ArrayList) term4310107).add(term4310111);
        ((ArrayList) term4310107).add(term4310113);
        ((ArrayList) term4310107).add(term4310115);
        ((ArrayList) term4310107).add(term4310117);
        term4310030 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4310032 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4310048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4310049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4310053 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4310058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4310059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4310063 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4310030, term4310030.getClass(), "id", -8855798763112672667L);
        setLongField(term4310032, term4310032.getClass(), "id", 862994133156280178L);
        setField(term4310032, term4310032.getClass(), "extId", term4310034);
        setField(term4310032, term4310032.getClass(), "luid", "uWhVFBZnWd");
        setIntField(term4310049, term4310049.getClass(), "year", 2020);
        setShortField(term4310049, term4310049.getClass(), "month", (short) 10);
        setShortField(term4310049, term4310049.getClass(), "day", (short) 29);
        setField(term4310048, term4310048.getClass(), "date", term4310049);
        setByteField(term4310053, term4310053.getClass(), "hour", (byte) 15);
        setByteField(term4310053, term4310053.getClass(), "minute", (byte) 32);
        setByteField(term4310053, term4310053.getClass(), "second", (byte) 6);
        setIntField(term4310053, term4310053.getClass(), "nano", 789979480);
        setField(term4310048, term4310048.getClass(), "time", term4310053);
        setField(term4310032, term4310032.getClass(), "registerTime", term4310048);
        setIntField(term4310059, term4310059.getClass(), "year", 2027);
        setShortField(term4310059, term4310059.getClass(), "month", (short) 9);
        setShortField(term4310059, term4310059.getClass(), "day", (short) 10);
        setField(term4310058, term4310058.getClass(), "date", term4310059);
        setByteField(term4310063, term4310063.getClass(), "hour", (byte) 20);
        setByteField(term4310063, term4310063.getClass(), "minute", (byte) 23);
        setByteField(term4310063, term4310063.getClass(), "second", (byte) 44);
        setIntField(term4310063, term4310063.getClass(), "nano", 101048929);
        setField(term4310058, term4310058.getClass(), "time", term4310063);
        setField(term4310032, term4310032.getClass(), "accessTime", term4310058);
        setField(term4310030, term4310030.getClass(), "card", term4310032);
        setField(term4310030, term4310030.getClass(), "userName", "ZmTjgCNXCC");
        setIntField(term4310030, term4310030.getClass(), "isNetMember", 952033328);
        setIntField(term4310030, term4310030.getClass(), "iconId", 909338815);
        setIntField(term4310030, term4310030.getClass(), "plateId", 1175998491);
        setIntField(term4310030, term4310030.getClass(), "titleId", -1723156691);
        setIntField(term4310030, term4310030.getClass(), "partnerId", 1688805927);
        setIntField(term4310030, term4310030.getClass(), "frameId", 1880061446);
        setIntField(term4310030, term4310030.getClass(), "selectMapId", -1521674295);
        setIntField(term4310030, term4310030.getClass(), "totalAwake", -1284679084);
        setIntField(term4310030, term4310030.getClass(), "gradeRating", -2143419820);
        setIntField(term4310030, term4310030.getClass(), "musicRating", -887995822);
        setIntField(term4310030, term4310030.getClass(), "playerRating", -789939363);
        setIntField(term4310030, term4310030.getClass(), "highestRating", -124890358);
        setIntField(term4310030, term4310030.getClass(), "gradeRank", 2077698906);
        setIntField(term4310030, term4310030.getClass(), "classRank", 504643843);
        setIntField(term4310030, term4310030.getClass(), "courseRank", -339524033);
        setField(term4310030, term4310030.getClass(), "charaSlot", term4310095);
        setField(term4310030, term4310030.getClass(), "charaLockSlot", term4310107);
        setLongField(term4310030, term4310030.getClass(), "contentBit", -5816424714883183787L);
        setIntField(term4310030, term4310030.getClass(), "playCount", 1199183508);
        setField(term4310030, term4310030.getClass(), "eventWatchedDate", "gnmKfrHqWx");
        setField(term4310030, term4310030.getClass(), "lastGameId", "ZTOxfCYRxh");
        setField(term4310030, term4310030.getClass(), "lastRomVersion", "KaHtTCmKiL");
        setField(term4310030, term4310030.getClass(), "lastDataVersion", "RWzyWESRQp");
        setField(term4310030, term4310030.getClass(), "lastLoginDate", "JzNXESpWMD");
        setField(term4310030, term4310030.getClass(), "lastPlayDate", "QsZOZJZxYC");
        setIntField(term4310030, term4310030.getClass(), "lastPlayCredit", 668570093);
        setIntField(term4310030, term4310030.getClass(), "lastPlayMode", -478830187);
        setIntField(term4310030, term4310030.getClass(), "lastPlaceId", 1925738660);
        setField(term4310030, term4310030.getClass(), "lastPlaceName", "PiIDNJuxDZ");
        setIntField(term4310030, term4310030.getClass(), "lastAllNetId", 1673165699);
        setIntField(term4310030, term4310030.getClass(), "lastRegionId", 1260558812);
        setField(term4310030, term4310030.getClass(), "lastRegionName", "ZjrMTZJZcq");
        setField(term4310030, term4310030.getClass(), "lastClientId", "ElGPYGKZNI");
        setField(term4310030, term4310030.getClass(), "lastCountryCode", "GExOBPtaDr");
        setIntField(term4310030, term4310030.getClass(), "lastSelectEMoney", 1820895830);
        setIntField(term4310030, term4310030.getClass(), "lastSelectTicket", 1690269235);
        setIntField(term4310030, term4310030.getClass(), "lastSelectCourse", -952044142);
        setIntField(term4310030, term4310030.getClass(), "lastCountCourse", -642513072);
        setField(term4310030, term4310030.getClass(), "firstGameId", "MZefmeanNv");
        setField(term4310030, term4310030.getClass(), "firstRomVersion", "YBihYWGZYC");
        setField(term4310030, term4310030.getClass(), "firstDataVersion", "nuZSTDALhr");
        setField(term4310030, term4310030.getClass(), "firstPlayDate", "OvAPeCkaMD");
        setField(term4310030, term4310030.getClass(), "compatibleCmVersion", "izQYoMgtHX");
        setField(term4310030, term4310030.getClass(), "dailyBonusDate", "oTvpMqFfTF");
        setField(term4310030, term4310030.getClass(), "dailyCourseBonusDate", "fFCmMPCrSw");
        setField(term4310030, term4310030.getClass(), "lastPairLoginDate", "RPyVNzgSIw");
        setField(term4310030, term4310030.getClass(), "lastTrialPlayDate", "MwJFVnqeoU");
        setIntField(term4310030, term4310030.getClass(), "playVsCount", 104499807);
        setIntField(term4310030, term4310030.getClass(), "playSyncCount", -1347095830);
        setIntField(term4310030, term4310030.getClass(), "winCount", -1890043215);
        setIntField(term4310030, term4310030.getClass(), "helpCount", 2018984021);
        setIntField(term4310030, term4310030.getClass(), "comboCount", -1876764991);
        setLongField(term4310030, term4310030.getClass(), "totalDeluxscore", 1801756504499728551L);
        setLongField(term4310030, term4310030.getClass(), "totalBasicDeluxscore", -7737732198594509562L);
        setLongField(term4310030, term4310030.getClass(), "totalAdvancedDeluxscore", -6935048008008035383L);
        setLongField(term4310030, term4310030.getClass(), "totalExpertDeluxscore", -6158948513456153723L);
        setLongField(term4310030, term4310030.getClass(), "totalMasterDeluxscore", -7666628576339135164L);
        setLongField(term4310030, term4310030.getClass(), "totalReMasterDeluxscore", 5855456482107689640L);
        setIntField(term4310030, term4310030.getClass(), "totalSync", -251549117);
        setIntField(term4310030, term4310030.getClass(), "totalBasicSync", -1872583327);
        setIntField(term4310030, term4310030.getClass(), "totalAdvancedSync", 1853137562);
        setIntField(term4310030, term4310030.getClass(), "totalExpertSync", -185522435);
        setIntField(term4310030, term4310030.getClass(), "totalMasterSync", 158751890);
        setIntField(term4310030, term4310030.getClass(), "totalReMasterSync", 1047259202);
        setLongField(term4310030, term4310030.getClass(), "totalAchievement", 7753373948696752208L);
        setLongField(term4310030, term4310030.getClass(), "totalBasicAchievement", 5851929314565536814L);
        setLongField(term4310030, term4310030.getClass(), "totalAdvancedAchievement", 3833340748041509819L);
        setLongField(term4310030, term4310030.getClass(), "totalExpertAchievement", -397881539503401947L);
        setLongField(term4310030, term4310030.getClass(), "totalMasterAchievement", -8356016576183957781L);
        setLongField(term4310030, term4310030.getClass(), "totalReMasterAchievement", -1726977521485815925L);
        setLongField(term4310030, term4310030.getClass(), "playerOldRating", -1639865514479992029L);
        setLongField(term4310030, term4310030.getClass(), "playerNewRating", 3713178045781100856L);
        setIntField(term4310030, term4310030.getClass(), "banState", 2011427188);
        setLongField(term4310030, term4310030.getClass(), "dateTime", 4383069449272769797L);
        term4310387 = new Integer(-1498184518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4310387;
        callMethod(klass, "setTotalExpertSync", argTypes, term4310030, args);
    }

};


