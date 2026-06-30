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

public class UserDetail_setTotalAchievement_1484519093144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4311755;
     Object term4312108;

    public UserDetail_setTotalAchievement_1484519093144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4311759 = new Long(3909767097276933654L);
        Integer term4311822 = new Integer(-1202675628);
        Integer term4311824 = new Integer(-117044732);
        Integer term4311826 = new Integer(-912545932);
        Integer term4311828 = new Integer(-323859);
        ArrayList term4311820 = new ArrayList();
        ((ArrayList) term4311820).add(term4311822);
        ((ArrayList) term4311820).add(term4311824);
        ((ArrayList) term4311820).add(term4311826);
        ((ArrayList) term4311820).add(term4311828);
        Integer term4311834 = new Integer(181699558);
        Integer term4311836 = new Integer(-258863944);
        Integer term4311838 = new Integer(634023528);
        ArrayList term4311832 = new ArrayList();
        ((ArrayList) term4311832).add(term4311834);
        ((ArrayList) term4311832).add(term4311836);
        ((ArrayList) term4311832).add(term4311838);
        term4311755 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4311757 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4311773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4311774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4311778 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4311783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4311784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4311788 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4311755, term4311755.getClass(), "id", 3636884597352461003L);
        setLongField(term4311757, term4311757.getClass(), "id", 2814259573742231743L);
        setField(term4311757, term4311757.getClass(), "extId", term4311759);
        setField(term4311757, term4311757.getClass(), "luid", "QZBrrZjbVe");
        setIntField(term4311774, term4311774.getClass(), "year", 2026);
        setShortField(term4311774, term4311774.getClass(), "month", (short) 1);
        setShortField(term4311774, term4311774.getClass(), "day", (short) 26);
        setField(term4311773, term4311773.getClass(), "date", term4311774);
        setByteField(term4311778, term4311778.getClass(), "hour", (byte) 5);
        setByteField(term4311778, term4311778.getClass(), "minute", (byte) 57);
        setByteField(term4311778, term4311778.getClass(), "second", (byte) 36);
        setIntField(term4311778, term4311778.getClass(), "nano", 260983207);
        setField(term4311773, term4311773.getClass(), "time", term4311778);
        setField(term4311757, term4311757.getClass(), "registerTime", term4311773);
        setIntField(term4311784, term4311784.getClass(), "year", 2010);
        setShortField(term4311784, term4311784.getClass(), "month", (short) 7);
        setShortField(term4311784, term4311784.getClass(), "day", (short) 28);
        setField(term4311783, term4311783.getClass(), "date", term4311784);
        setByteField(term4311788, term4311788.getClass(), "hour", (byte) 21);
        setByteField(term4311788, term4311788.getClass(), "minute", (byte) 29);
        setByteField(term4311788, term4311788.getClass(), "second", (byte) 45);
        setIntField(term4311788, term4311788.getClass(), "nano", 700591383);
        setField(term4311783, term4311783.getClass(), "time", term4311788);
        setField(term4311757, term4311757.getClass(), "accessTime", term4311783);
        setField(term4311755, term4311755.getClass(), "card", term4311757);
        setField(term4311755, term4311755.getClass(), "userName", "IESgZjpgdh");
        setIntField(term4311755, term4311755.getClass(), "isNetMember", -1736484168);
        setIntField(term4311755, term4311755.getClass(), "iconId", -548085329);
        setIntField(term4311755, term4311755.getClass(), "plateId", -448688366);
        setIntField(term4311755, term4311755.getClass(), "titleId", 1663408814);
        setIntField(term4311755, term4311755.getClass(), "partnerId", -1701777910);
        setIntField(term4311755, term4311755.getClass(), "frameId", 993027879);
        setIntField(term4311755, term4311755.getClass(), "selectMapId", -1327564481);
        setIntField(term4311755, term4311755.getClass(), "totalAwake", 1393329984);
        setIntField(term4311755, term4311755.getClass(), "gradeRating", 783843460);
        setIntField(term4311755, term4311755.getClass(), "musicRating", 40531481);
        setIntField(term4311755, term4311755.getClass(), "playerRating", 640219875);
        setIntField(term4311755, term4311755.getClass(), "highestRating", 735121904);
        setIntField(term4311755, term4311755.getClass(), "gradeRank", -336594618);
        setIntField(term4311755, term4311755.getClass(), "classRank", -368002382);
        setIntField(term4311755, term4311755.getClass(), "courseRank", 1363414212);
        setField(term4311755, term4311755.getClass(), "charaSlot", term4311820);
        setField(term4311755, term4311755.getClass(), "charaLockSlot", term4311832);
        setLongField(term4311755, term4311755.getClass(), "contentBit", 1060090360762824375L);
        setIntField(term4311755, term4311755.getClass(), "playCount", -1462231395);
        setField(term4311755, term4311755.getClass(), "eventWatchedDate", "GcEVNqSGXK");
        setField(term4311755, term4311755.getClass(), "lastGameId", "DrVeCCyQcT");
        setField(term4311755, term4311755.getClass(), "lastRomVersion", "qHVENziCVL");
        setField(term4311755, term4311755.getClass(), "lastDataVersion", "xLoyycSeLj");
        setField(term4311755, term4311755.getClass(), "lastLoginDate", "oQIWLgBVwy");
        setField(term4311755, term4311755.getClass(), "lastPlayDate", "ZlhDPjQmIF");
        setIntField(term4311755, term4311755.getClass(), "lastPlayCredit", 1568542890);
        setIntField(term4311755, term4311755.getClass(), "lastPlayMode", -792271327);
        setIntField(term4311755, term4311755.getClass(), "lastPlaceId", -1369773906);
        setField(term4311755, term4311755.getClass(), "lastPlaceName", "zmBBIBmDUn");
        setIntField(term4311755, term4311755.getClass(), "lastAllNetId", 834186025);
        setIntField(term4311755, term4311755.getClass(), "lastRegionId", 1876721137);
        setField(term4311755, term4311755.getClass(), "lastRegionName", "UUIRkZGNKn");
        setField(term4311755, term4311755.getClass(), "lastClientId", "fOVtdCQIlN");
        setField(term4311755, term4311755.getClass(), "lastCountryCode", "yGgSvmqEUF");
        setIntField(term4311755, term4311755.getClass(), "lastSelectEMoney", 888763753);
        setIntField(term4311755, term4311755.getClass(), "lastSelectTicket", 1062185403);
        setIntField(term4311755, term4311755.getClass(), "lastSelectCourse", -262953874);
        setIntField(term4311755, term4311755.getClass(), "lastCountCourse", 723573534);
        setField(term4311755, term4311755.getClass(), "firstGameId", "dVqiauKdDk");
        setField(term4311755, term4311755.getClass(), "firstRomVersion", "cNdRuPUYor");
        setField(term4311755, term4311755.getClass(), "firstDataVersion", "FPiKFJyXFL");
        setField(term4311755, term4311755.getClass(), "firstPlayDate", "QrSgQAumsp");
        setField(term4311755, term4311755.getClass(), "compatibleCmVersion", "JdjAmWivie");
        setField(term4311755, term4311755.getClass(), "dailyBonusDate", "pxLongdFbj");
        setField(term4311755, term4311755.getClass(), "dailyCourseBonusDate", "ifyBYhySmq");
        setField(term4311755, term4311755.getClass(), "lastPairLoginDate", "QTYwcpTKLA");
        setField(term4311755, term4311755.getClass(), "lastTrialPlayDate", "NayJJRUCsk");
        setIntField(term4311755, term4311755.getClass(), "playVsCount", -1636462216);
        setIntField(term4311755, term4311755.getClass(), "playSyncCount", -551015211);
        setIntField(term4311755, term4311755.getClass(), "winCount", 643798641);
        setIntField(term4311755, term4311755.getClass(), "helpCount", 666198818);
        setIntField(term4311755, term4311755.getClass(), "comboCount", -854172551);
        setLongField(term4311755, term4311755.getClass(), "totalDeluxscore", -8014908309227274475L);
        setLongField(term4311755, term4311755.getClass(), "totalBasicDeluxscore", 1783199531147444885L);
        setLongField(term4311755, term4311755.getClass(), "totalAdvancedDeluxscore", 1984275870804600047L);
        setLongField(term4311755, term4311755.getClass(), "totalExpertDeluxscore", -7705764810359723784L);
        setLongField(term4311755, term4311755.getClass(), "totalMasterDeluxscore", 7261137265890505386L);
        setLongField(term4311755, term4311755.getClass(), "totalReMasterDeluxscore", 7736793775279736773L);
        setIntField(term4311755, term4311755.getClass(), "totalSync", -155093639);
        setIntField(term4311755, term4311755.getClass(), "totalBasicSync", 654486488);
        setIntField(term4311755, term4311755.getClass(), "totalAdvancedSync", 1197272632);
        setIntField(term4311755, term4311755.getClass(), "totalExpertSync", 2020163685);
        setIntField(term4311755, term4311755.getClass(), "totalMasterSync", 2093882045);
        setIntField(term4311755, term4311755.getClass(), "totalReMasterSync", -473386855);
        setLongField(term4311755, term4311755.getClass(), "totalAchievement", 3072396042106987486L);
        setLongField(term4311755, term4311755.getClass(), "totalBasicAchievement", 1253064040427291416L);
        setLongField(term4311755, term4311755.getClass(), "totalAdvancedAchievement", -3025999755464909085L);
        setLongField(term4311755, term4311755.getClass(), "totalExpertAchievement", -7659945140116813208L);
        setLongField(term4311755, term4311755.getClass(), "totalMasterAchievement", 4743125512555329686L);
        setLongField(term4311755, term4311755.getClass(), "totalReMasterAchievement", -6253200616406348824L);
        setLongField(term4311755, term4311755.getClass(), "playerOldRating", 1050170907223322716L);
        setLongField(term4311755, term4311755.getClass(), "playerNewRating", -2535527931344192976L);
        setIntField(term4311755, term4311755.getClass(), "banState", 1448071314);
        setLongField(term4311755, term4311755.getClass(), "dateTime", 6052071314077132902L);
        term4312108 = new Long(7075477584691857436L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4312108;
        callMethod(klass, "setTotalAchievement", argTypes, term4311755, args);
    }

};


