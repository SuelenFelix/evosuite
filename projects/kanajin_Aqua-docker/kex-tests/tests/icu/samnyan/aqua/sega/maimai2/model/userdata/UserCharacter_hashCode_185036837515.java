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

public class UserCharacter_hashCode_185036837515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193715;

    public UserCharacter_hashCode_185036837515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term193721 = new Long(-3225860270104198596L);
        Integer term193784 = new Integer(-289872820);
        Integer term193786 = new Integer(999463901);
        Integer term193788 = new Integer(-1558642750);
        ArrayList term193782 = new ArrayList();
        ((ArrayList) term193782).add(term193784);
        ((ArrayList) term193782).add(term193786);
        ((ArrayList) term193782).add(term193788);
        Integer term193794 = new Integer(1177832973);
        ArrayList term193792 = new ArrayList();
        ((ArrayList) term193792).add(term193794);
        term193715 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term193717 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term193719 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term193735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term193736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term193740 = newInstance(Class.forName("java.time.LocalTime"));
        Object term193745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term193746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term193750 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term193715, term193715.getClass(), "id", 2407935088272718472L);
        setLongField(term193717, term193717.getClass(), "id", -5822579006187144558L);
        setLongField(term193719, term193719.getClass(), "id", 4718014703042298733L);
        setField(term193719, term193719.getClass(), "extId", term193721);
        setField(term193719, term193719.getClass(), "luid", "CtxCIgenEk");
        setIntField(term193736, term193736.getClass(), "year", 2016);
        setShortField(term193736, term193736.getClass(), "month", (short) 4);
        setShortField(term193736, term193736.getClass(), "day", (short) 16);
        setField(term193735, term193735.getClass(), "date", term193736);
        setByteField(term193740, term193740.getClass(), "hour", (byte) 16);
        setByteField(term193740, term193740.getClass(), "minute", (byte) 43);
        setByteField(term193740, term193740.getClass(), "second", (byte) 51);
        setIntField(term193740, term193740.getClass(), "nano", 40671521);
        setField(term193735, term193735.getClass(), "time", term193740);
        setField(term193719, term193719.getClass(), "registerTime", term193735);
        setIntField(term193746, term193746.getClass(), "year", 2028);
        setShortField(term193746, term193746.getClass(), "month", (short) 7);
        setShortField(term193746, term193746.getClass(), "day", (short) 13);
        setField(term193745, term193745.getClass(), "date", term193746);
        setByteField(term193750, term193750.getClass(), "hour", (byte) 9);
        setByteField(term193750, term193750.getClass(), "minute", (byte) 46);
        setByteField(term193750, term193750.getClass(), "second", (byte) 40);
        setIntField(term193750, term193750.getClass(), "nano", 919051236);
        setField(term193745, term193745.getClass(), "time", term193750);
        setField(term193719, term193719.getClass(), "accessTime", term193745);
        setField(term193717, term193717.getClass(), "card", term193719);
        setField(term193717, term193717.getClass(), "userName", "BxNhqJkpzh");
        setIntField(term193717, term193717.getClass(), "isNetMember", 26818439);
        setIntField(term193717, term193717.getClass(), "iconId", 1721802598);
        setIntField(term193717, term193717.getClass(), "plateId", -1208938714);
        setIntField(term193717, term193717.getClass(), "titleId", -1241552174);
        setIntField(term193717, term193717.getClass(), "partnerId", 1571367099);
        setIntField(term193717, term193717.getClass(), "frameId", -106290041);
        setIntField(term193717, term193717.getClass(), "selectMapId", -1931235714);
        setIntField(term193717, term193717.getClass(), "totalAwake", 1975801653);
        setIntField(term193717, term193717.getClass(), "gradeRating", -2017767309);
        setIntField(term193717, term193717.getClass(), "musicRating", 1167998823);
        setIntField(term193717, term193717.getClass(), "playerRating", -464580200);
        setIntField(term193717, term193717.getClass(), "highestRating", -599457969);
        setIntField(term193717, term193717.getClass(), "gradeRank", -1479981191);
        setIntField(term193717, term193717.getClass(), "classRank", -2140535400);
        setIntField(term193717, term193717.getClass(), "courseRank", -1606011085);
        setField(term193717, term193717.getClass(), "charaSlot", term193782);
        setField(term193717, term193717.getClass(), "charaLockSlot", term193792);
        setLongField(term193717, term193717.getClass(), "contentBit", -4136071709153486481L);
        setIntField(term193717, term193717.getClass(), "playCount", 460089767);
        setField(term193717, term193717.getClass(), "eventWatchedDate", "zukENECSXB");
        setField(term193717, term193717.getClass(), "lastGameId", "svGVEkynTC");
        setField(term193717, term193717.getClass(), "lastRomVersion", "aBNkBoMFBD");
        setField(term193717, term193717.getClass(), "lastDataVersion", "vqWeaGfohT");
        setField(term193717, term193717.getClass(), "lastLoginDate", "yabXWbBRfo");
        setField(term193717, term193717.getClass(), "lastPlayDate", "IZlNsiBzLl");
        setIntField(term193717, term193717.getClass(), "lastPlayCredit", -243759577);
        setIntField(term193717, term193717.getClass(), "lastPlayMode", 1346767326);
        setIntField(term193717, term193717.getClass(), "lastPlaceId", -2092002829);
        setField(term193717, term193717.getClass(), "lastPlaceName", "cZTgmafbYV");
        setIntField(term193717, term193717.getClass(), "lastAllNetId", -1361580827);
        setIntField(term193717, term193717.getClass(), "lastRegionId", -958463390);
        setField(term193717, term193717.getClass(), "lastRegionName", "RLzTlJiyRN");
        setField(term193717, term193717.getClass(), "lastClientId", "aDeEhgiUgQ");
        setField(term193717, term193717.getClass(), "lastCountryCode", "FCqDLvWKzc");
        setIntField(term193717, term193717.getClass(), "lastSelectEMoney", 1950799121);
        setIntField(term193717, term193717.getClass(), "lastSelectTicket", -323987081);
        setIntField(term193717, term193717.getClass(), "lastSelectCourse", -917394097);
        setIntField(term193717, term193717.getClass(), "lastCountCourse", -1877002042);
        setField(term193717, term193717.getClass(), "firstGameId", "MiydJqGGaE");
        setField(term193717, term193717.getClass(), "firstRomVersion", "ncYBFFKRYX");
        setField(term193717, term193717.getClass(), "firstDataVersion", "OtwcFpbHya");
        setField(term193717, term193717.getClass(), "firstPlayDate", "ZQTwlFBqLd");
        setField(term193717, term193717.getClass(), "compatibleCmVersion", "FTSegVMXzZ");
        setField(term193717, term193717.getClass(), "dailyBonusDate", "YdclkiqKLw");
        setField(term193717, term193717.getClass(), "dailyCourseBonusDate", "HjnANDAraH");
        setField(term193717, term193717.getClass(), "lastPairLoginDate", "ArRbkfOXUU");
        setField(term193717, term193717.getClass(), "lastTrialPlayDate", "usMwphyYRn");
        setIntField(term193717, term193717.getClass(), "playVsCount", 1442941255);
        setIntField(term193717, term193717.getClass(), "playSyncCount", 1666341034);
        setIntField(term193717, term193717.getClass(), "winCount", -46731631);
        setIntField(term193717, term193717.getClass(), "helpCount", -1256254174);
        setIntField(term193717, term193717.getClass(), "comboCount", -1808461007);
        setLongField(term193717, term193717.getClass(), "totalDeluxscore", -7434060125622887962L);
        setLongField(term193717, term193717.getClass(), "totalBasicDeluxscore", 3061844783583932944L);
        setLongField(term193717, term193717.getClass(), "totalAdvancedDeluxscore", 579647697066713042L);
        setLongField(term193717, term193717.getClass(), "totalExpertDeluxscore", 8047197957641770490L);
        setLongField(term193717, term193717.getClass(), "totalMasterDeluxscore", 390732796135404621L);
        setLongField(term193717, term193717.getClass(), "totalReMasterDeluxscore", -1313429829170420807L);
        setIntField(term193717, term193717.getClass(), "totalSync", -497824423);
        setIntField(term193717, term193717.getClass(), "totalBasicSync", -1924448836);
        setIntField(term193717, term193717.getClass(), "totalAdvancedSync", -220172762);
        setIntField(term193717, term193717.getClass(), "totalExpertSync", -91583035);
        setIntField(term193717, term193717.getClass(), "totalMasterSync", 1118579974);
        setIntField(term193717, term193717.getClass(), "totalReMasterSync", 1007007632);
        setLongField(term193717, term193717.getClass(), "totalAchievement", 4646468012048228694L);
        setLongField(term193717, term193717.getClass(), "totalBasicAchievement", 1076765182729234215L);
        setLongField(term193717, term193717.getClass(), "totalAdvancedAchievement", 7483921550995914675L);
        setLongField(term193717, term193717.getClass(), "totalExpertAchievement", 578586871524293101L);
        setLongField(term193717, term193717.getClass(), "totalMasterAchievement", 146593563962570001L);
        setLongField(term193717, term193717.getClass(), "totalReMasterAchievement", -7026476516621146038L);
        setLongField(term193717, term193717.getClass(), "playerOldRating", 1672998899023933550L);
        setLongField(term193717, term193717.getClass(), "playerNewRating", 1713676158068956691L);
        setIntField(term193717, term193717.getClass(), "banState", -885454757);
        setLongField(term193717, term193717.getClass(), "dateTime", -3353280215933613893L);
        setField(term193715, term193715.getClass(), "user", term193717);
        setIntField(term193715, term193715.getClass(), "characterId", -1232749539);
        setIntField(term193715, term193715.getClass(), "level", -381558021);
        setIntField(term193715, term193715.getClass(), "awakening", 1819668222);
        setIntField(term193715, term193715.getClass(), "useCount", 655578194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term193715, args);
    }

};


