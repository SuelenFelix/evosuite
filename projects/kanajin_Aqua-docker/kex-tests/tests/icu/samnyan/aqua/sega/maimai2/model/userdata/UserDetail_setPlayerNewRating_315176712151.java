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

public class UserDetail_setPlayerNewRating_315176712151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4315724;
     Object term4316075;

    public UserDetail_setPlayerNewRating_315176712151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4315728 = new Long(2438792678064435188L);
        Integer term4315791 = new Integer(399255289);
        Integer term4315793 = new Integer(-188927419);
        ArrayList term4315789 = new ArrayList();
        ((ArrayList) term4315789).add(term4315791);
        ((ArrayList) term4315789).add(term4315793);
        Integer term4315799 = new Integer(865923167);
        Integer term4315801 = new Integer(411168220);
        Integer term4315803 = new Integer(-37027662);
        Integer term4315805 = new Integer(1314903229);
        ArrayList term4315797 = new ArrayList();
        ((ArrayList) term4315797).add(term4315799);
        ((ArrayList) term4315797).add(term4315801);
        ((ArrayList) term4315797).add(term4315803);
        ((ArrayList) term4315797).add(term4315805);
        term4315724 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4315726 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4315742 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4315743 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4315747 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4315752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4315753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4315757 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4315724, term4315724.getClass(), "id", 7330152684565217808L);
        setLongField(term4315726, term4315726.getClass(), "id", 5907518607711470238L);
        setField(term4315726, term4315726.getClass(), "extId", term4315728);
        setField(term4315726, term4315726.getClass(), "luid", "uZPbnItebX");
        setIntField(term4315743, term4315743.getClass(), "year", 2015);
        setShortField(term4315743, term4315743.getClass(), "month", (short) 9);
        setShortField(term4315743, term4315743.getClass(), "day", (short) 18);
        setField(term4315742, term4315742.getClass(), "date", term4315743);
        setByteField(term4315747, term4315747.getClass(), "hour", (byte) 5);
        setByteField(term4315747, term4315747.getClass(), "minute", (byte) 19);
        setByteField(term4315747, term4315747.getClass(), "second", (byte) 3);
        setIntField(term4315747, term4315747.getClass(), "nano", 602501050);
        setField(term4315742, term4315742.getClass(), "time", term4315747);
        setField(term4315726, term4315726.getClass(), "registerTime", term4315742);
        setIntField(term4315753, term4315753.getClass(), "year", 2018);
        setShortField(term4315753, term4315753.getClass(), "month", (short) 8);
        setShortField(term4315753, term4315753.getClass(), "day", (short) 4);
        setField(term4315752, term4315752.getClass(), "date", term4315753);
        setByteField(term4315757, term4315757.getClass(), "hour", (byte) 11);
        setByteField(term4315757, term4315757.getClass(), "minute", (byte) 47);
        setByteField(term4315757, term4315757.getClass(), "second", (byte) 57);
        setIntField(term4315757, term4315757.getClass(), "nano", 39718245);
        setField(term4315752, term4315752.getClass(), "time", term4315757);
        setField(term4315726, term4315726.getClass(), "accessTime", term4315752);
        setField(term4315724, term4315724.getClass(), "card", term4315726);
        setField(term4315724, term4315724.getClass(), "userName", "JqUdQXYveL");
        setIntField(term4315724, term4315724.getClass(), "isNetMember", 2098808668);
        setIntField(term4315724, term4315724.getClass(), "iconId", 606549767);
        setIntField(term4315724, term4315724.getClass(), "plateId", 753723231);
        setIntField(term4315724, term4315724.getClass(), "titleId", 1454058087);
        setIntField(term4315724, term4315724.getClass(), "partnerId", 1509831835);
        setIntField(term4315724, term4315724.getClass(), "frameId", 1900651199);
        setIntField(term4315724, term4315724.getClass(), "selectMapId", 2100951070);
        setIntField(term4315724, term4315724.getClass(), "totalAwake", -1847938272);
        setIntField(term4315724, term4315724.getClass(), "gradeRating", -659653524);
        setIntField(term4315724, term4315724.getClass(), "musicRating", 1843548304);
        setIntField(term4315724, term4315724.getClass(), "playerRating", 11672705);
        setIntField(term4315724, term4315724.getClass(), "highestRating", 80551631);
        setIntField(term4315724, term4315724.getClass(), "gradeRank", 1131820287);
        setIntField(term4315724, term4315724.getClass(), "classRank", -157530908);
        setIntField(term4315724, term4315724.getClass(), "courseRank", 1489225863);
        setField(term4315724, term4315724.getClass(), "charaSlot", term4315789);
        setField(term4315724, term4315724.getClass(), "charaLockSlot", term4315797);
        setLongField(term4315724, term4315724.getClass(), "contentBit", 208394449067168381L);
        setIntField(term4315724, term4315724.getClass(), "playCount", 1053358544);
        setField(term4315724, term4315724.getClass(), "eventWatchedDate", "DmbukFheHf");
        setField(term4315724, term4315724.getClass(), "lastGameId", "EGuOpFFGsm");
        setField(term4315724, term4315724.getClass(), "lastRomVersion", "bhVCefNBLD");
        setField(term4315724, term4315724.getClass(), "lastDataVersion", "XoowpVKWVi");
        setField(term4315724, term4315724.getClass(), "lastLoginDate", "vBHTpJtVZY");
        setField(term4315724, term4315724.getClass(), "lastPlayDate", "DkghaFEWnj");
        setIntField(term4315724, term4315724.getClass(), "lastPlayCredit", 548561798);
        setIntField(term4315724, term4315724.getClass(), "lastPlayMode", 445920268);
        setIntField(term4315724, term4315724.getClass(), "lastPlaceId", 1566415107);
        setField(term4315724, term4315724.getClass(), "lastPlaceName", "mJGREtKwmb");
        setIntField(term4315724, term4315724.getClass(), "lastAllNetId", -93533491);
        setIntField(term4315724, term4315724.getClass(), "lastRegionId", -1813962453);
        setField(term4315724, term4315724.getClass(), "lastRegionName", "imjrVJyMNs");
        setField(term4315724, term4315724.getClass(), "lastClientId", "SwFoEzSAPI");
        setField(term4315724, term4315724.getClass(), "lastCountryCode", "SrLiJSrVDT");
        setIntField(term4315724, term4315724.getClass(), "lastSelectEMoney", -1722059237);
        setIntField(term4315724, term4315724.getClass(), "lastSelectTicket", -109116493);
        setIntField(term4315724, term4315724.getClass(), "lastSelectCourse", -1343487169);
        setIntField(term4315724, term4315724.getClass(), "lastCountCourse", -1822778556);
        setField(term4315724, term4315724.getClass(), "firstGameId", "cXGwnmRtqM");
        setField(term4315724, term4315724.getClass(), "firstRomVersion", "TcJCTsYjpy");
        setField(term4315724, term4315724.getClass(), "firstDataVersion", "mwpEMeHHKQ");
        setField(term4315724, term4315724.getClass(), "firstPlayDate", "DfPrTSIVwn");
        setField(term4315724, term4315724.getClass(), "compatibleCmVersion", "WESfJQpRAM");
        setField(term4315724, term4315724.getClass(), "dailyBonusDate", "BiKXUAKwAE");
        setField(term4315724, term4315724.getClass(), "dailyCourseBonusDate", "wzgDFfUSVI");
        setField(term4315724, term4315724.getClass(), "lastPairLoginDate", "VeMCGracSu");
        setField(term4315724, term4315724.getClass(), "lastTrialPlayDate", "kAnahAdXVS");
        setIntField(term4315724, term4315724.getClass(), "playVsCount", 1088148754);
        setIntField(term4315724, term4315724.getClass(), "playSyncCount", 295400593);
        setIntField(term4315724, term4315724.getClass(), "winCount", -1693715404);
        setIntField(term4315724, term4315724.getClass(), "helpCount", 1436377797);
        setIntField(term4315724, term4315724.getClass(), "comboCount", -584607427);
        setLongField(term4315724, term4315724.getClass(), "totalDeluxscore", -3078833221835835832L);
        setLongField(term4315724, term4315724.getClass(), "totalBasicDeluxscore", 8466193567166100733L);
        setLongField(term4315724, term4315724.getClass(), "totalAdvancedDeluxscore", -1144947627626390215L);
        setLongField(term4315724, term4315724.getClass(), "totalExpertDeluxscore", 1540284078884896886L);
        setLongField(term4315724, term4315724.getClass(), "totalMasterDeluxscore", 3059123465149592056L);
        setLongField(term4315724, term4315724.getClass(), "totalReMasterDeluxscore", -7780272771437939882L);
        setIntField(term4315724, term4315724.getClass(), "totalSync", -1367249815);
        setIntField(term4315724, term4315724.getClass(), "totalBasicSync", 762628947);
        setIntField(term4315724, term4315724.getClass(), "totalAdvancedSync", 2026618614);
        setIntField(term4315724, term4315724.getClass(), "totalExpertSync", -149719077);
        setIntField(term4315724, term4315724.getClass(), "totalMasterSync", -1468238677);
        setIntField(term4315724, term4315724.getClass(), "totalReMasterSync", 212261917);
        setLongField(term4315724, term4315724.getClass(), "totalAchievement", -1016094926275506488L);
        setLongField(term4315724, term4315724.getClass(), "totalBasicAchievement", -4553429547767152749L);
        setLongField(term4315724, term4315724.getClass(), "totalAdvancedAchievement", 3473659062469591889L);
        setLongField(term4315724, term4315724.getClass(), "totalExpertAchievement", 4006840216845193965L);
        setLongField(term4315724, term4315724.getClass(), "totalMasterAchievement", -66167113155977088L);
        setLongField(term4315724, term4315724.getClass(), "totalReMasterAchievement", 5961346251302051702L);
        setLongField(term4315724, term4315724.getClass(), "playerOldRating", -443708318379401558L);
        setLongField(term4315724, term4315724.getClass(), "playerNewRating", 219293249365616723L);
        setIntField(term4315724, term4315724.getClass(), "banState", 111081317);
        setLongField(term4315724, term4315724.getClass(), "dateTime", 4043736060038922743L);
        term4316075 = new Long(-578264653160327484L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4316075;
        callMethod(klass, "setPlayerNewRating", argTypes, term4315724, args);
    }

};


