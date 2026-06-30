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

public class UserDetail_getLastPlaceName_25059784331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4247099;

    public UserDetail_getLastPlaceName_25059784331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4247103 = new Long(3436342391247100875L);
        Integer term4247166 = new Integer(902409852);
        Integer term4247168 = new Integer(500447593);
        Integer term4247170 = new Integer(206201108);
        Integer term4247172 = new Integer(-926229753);
        Integer term4247174 = new Integer(245326381);
        Integer term4247176 = new Integer(122420715);
        Integer term4247178 = new Integer(190071205);
        Integer term4247180 = new Integer(2096693078);
        ArrayList term4247164 = new ArrayList();
        ((ArrayList) term4247164).add(term4247166);
        ((ArrayList) term4247164).add(term4247168);
        ((ArrayList) term4247164).add(term4247170);
        ((ArrayList) term4247164).add(term4247172);
        ((ArrayList) term4247164).add(term4247174);
        ((ArrayList) term4247164).add(term4247176);
        ((ArrayList) term4247164).add(term4247178);
        ((ArrayList) term4247164).add(term4247180);
        Integer term4247186 = new Integer(1474853885);
        Integer term4247188 = new Integer(638225249);
        Integer term4247190 = new Integer(-669172505);
        Integer term4247192 = new Integer(1077847171);
        ArrayList term4247184 = new ArrayList();
        ((ArrayList) term4247184).add(term4247186);
        ((ArrayList) term4247184).add(term4247188);
        ((ArrayList) term4247184).add(term4247190);
        ((ArrayList) term4247184).add(term4247192);
        term4247099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4247101 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4247117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4247118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4247122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4247127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4247128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4247132 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4247099, term4247099.getClass(), "id", -6231652833021476604L);
        setLongField(term4247101, term4247101.getClass(), "id", 7383916636345776570L);
        setField(term4247101, term4247101.getClass(), "extId", term4247103);
        setField(term4247101, term4247101.getClass(), "luid", "SJsFYDjQTa");
        setIntField(term4247118, term4247118.getClass(), "year", 2018);
        setShortField(term4247118, term4247118.getClass(), "month", (short) 11);
        setShortField(term4247118, term4247118.getClass(), "day", (short) 27);
        setField(term4247117, term4247117.getClass(), "date", term4247118);
        setByteField(term4247122, term4247122.getClass(), "hour", (byte) 15);
        setByteField(term4247122, term4247122.getClass(), "minute", (byte) 18);
        setByteField(term4247122, term4247122.getClass(), "second", (byte) 41);
        setIntField(term4247122, term4247122.getClass(), "nano", 120199319);
        setField(term4247117, term4247117.getClass(), "time", term4247122);
        setField(term4247101, term4247101.getClass(), "registerTime", term4247117);
        setIntField(term4247128, term4247128.getClass(), "year", 2025);
        setShortField(term4247128, term4247128.getClass(), "month", (short) 6);
        setShortField(term4247128, term4247128.getClass(), "day", (short) 20);
        setField(term4247127, term4247127.getClass(), "date", term4247128);
        setByteField(term4247132, term4247132.getClass(), "hour", (byte) 1);
        setByteField(term4247132, term4247132.getClass(), "minute", (byte) 12);
        setByteField(term4247132, term4247132.getClass(), "second", (byte) 59);
        setIntField(term4247132, term4247132.getClass(), "nano", 97555613);
        setField(term4247127, term4247127.getClass(), "time", term4247132);
        setField(term4247101, term4247101.getClass(), "accessTime", term4247127);
        setField(term4247099, term4247099.getClass(), "card", term4247101);
        setField(term4247099, term4247099.getClass(), "userName", "DzOoQwbhvg");
        setIntField(term4247099, term4247099.getClass(), "isNetMember", -322679664);
        setIntField(term4247099, term4247099.getClass(), "iconId", -196078764);
        setIntField(term4247099, term4247099.getClass(), "plateId", -1464036401);
        setIntField(term4247099, term4247099.getClass(), "titleId", -814734969);
        setIntField(term4247099, term4247099.getClass(), "partnerId", 1616112979);
        setIntField(term4247099, term4247099.getClass(), "frameId", 151882997);
        setIntField(term4247099, term4247099.getClass(), "selectMapId", 692886878);
        setIntField(term4247099, term4247099.getClass(), "totalAwake", -1867036224);
        setIntField(term4247099, term4247099.getClass(), "gradeRating", -1676189729);
        setIntField(term4247099, term4247099.getClass(), "musicRating", 872759481);
        setIntField(term4247099, term4247099.getClass(), "playerRating", 1058295820);
        setIntField(term4247099, term4247099.getClass(), "highestRating", -2076705202);
        setIntField(term4247099, term4247099.getClass(), "gradeRank", -1859526288);
        setIntField(term4247099, term4247099.getClass(), "classRank", 1963519574);
        setIntField(term4247099, term4247099.getClass(), "courseRank", -1690856458);
        setField(term4247099, term4247099.getClass(), "charaSlot", term4247164);
        setField(term4247099, term4247099.getClass(), "charaLockSlot", term4247184);
        setLongField(term4247099, term4247099.getClass(), "contentBit", -4808052118911933034L);
        setIntField(term4247099, term4247099.getClass(), "playCount", -1740340349);
        setField(term4247099, term4247099.getClass(), "eventWatchedDate", "DIMlRsVBNI");
        setField(term4247099, term4247099.getClass(), "lastGameId", "EvFMYiQVhd");
        setField(term4247099, term4247099.getClass(), "lastRomVersion", "THqbSpBunD");
        setField(term4247099, term4247099.getClass(), "lastDataVersion", "KAxMcdAoNU");
        setField(term4247099, term4247099.getClass(), "lastLoginDate", "lUhGPezEqI");
        setField(term4247099, term4247099.getClass(), "lastPlayDate", "sqbQptTaLW");
        setIntField(term4247099, term4247099.getClass(), "lastPlayCredit", 1775647672);
        setIntField(term4247099, term4247099.getClass(), "lastPlayMode", 80431049);
        setIntField(term4247099, term4247099.getClass(), "lastPlaceId", -997222752);
        setField(term4247099, term4247099.getClass(), "lastPlaceName", "cFmNflHgFK");
        setIntField(term4247099, term4247099.getClass(), "lastAllNetId", 406928127);
        setIntField(term4247099, term4247099.getClass(), "lastRegionId", 351194388);
        setField(term4247099, term4247099.getClass(), "lastRegionName", "AKWiiVjhBf");
        setField(term4247099, term4247099.getClass(), "lastClientId", "USVdCeIQjB");
        setField(term4247099, term4247099.getClass(), "lastCountryCode", "hFdeTaIBOr");
        setIntField(term4247099, term4247099.getClass(), "lastSelectEMoney", 1755981690);
        setIntField(term4247099, term4247099.getClass(), "lastSelectTicket", 1385705548);
        setIntField(term4247099, term4247099.getClass(), "lastSelectCourse", 1311916153);
        setIntField(term4247099, term4247099.getClass(), "lastCountCourse", -962502656);
        setField(term4247099, term4247099.getClass(), "firstGameId", "ofQMitMcvB");
        setField(term4247099, term4247099.getClass(), "firstRomVersion", "CbYZjxRcyu");
        setField(term4247099, term4247099.getClass(), "firstDataVersion", "toUqvSNGTN");
        setField(term4247099, term4247099.getClass(), "firstPlayDate", "pxkBKCbgXf");
        setField(term4247099, term4247099.getClass(), "compatibleCmVersion", "RXWrpTKKAI");
        setField(term4247099, term4247099.getClass(), "dailyBonusDate", "xRyuuxuzXQ");
        setField(term4247099, term4247099.getClass(), "dailyCourseBonusDate", "OdmfqYePIV");
        setField(term4247099, term4247099.getClass(), "lastPairLoginDate", "FvFGgEvLjU");
        setField(term4247099, term4247099.getClass(), "lastTrialPlayDate", "CCnSszCide");
        setIntField(term4247099, term4247099.getClass(), "playVsCount", -681343842);
        setIntField(term4247099, term4247099.getClass(), "playSyncCount", 1715325583);
        setIntField(term4247099, term4247099.getClass(), "winCount", -671117633);
        setIntField(term4247099, term4247099.getClass(), "helpCount", 392988109);
        setIntField(term4247099, term4247099.getClass(), "comboCount", -1929721380);
        setLongField(term4247099, term4247099.getClass(), "totalDeluxscore", -2756957439281734474L);
        setLongField(term4247099, term4247099.getClass(), "totalBasicDeluxscore", -8516805929500564464L);
        setLongField(term4247099, term4247099.getClass(), "totalAdvancedDeluxscore", -5412573365300015064L);
        setLongField(term4247099, term4247099.getClass(), "totalExpertDeluxscore", 3705581421351246284L);
        setLongField(term4247099, term4247099.getClass(), "totalMasterDeluxscore", -7656831300738231673L);
        setLongField(term4247099, term4247099.getClass(), "totalReMasterDeluxscore", 179783697923883686L);
        setIntField(term4247099, term4247099.getClass(), "totalSync", -2054513632);
        setIntField(term4247099, term4247099.getClass(), "totalBasicSync", -748162821);
        setIntField(term4247099, term4247099.getClass(), "totalAdvancedSync", 1644390545);
        setIntField(term4247099, term4247099.getClass(), "totalExpertSync", -1739951566);
        setIntField(term4247099, term4247099.getClass(), "totalMasterSync", 1338723826);
        setIntField(term4247099, term4247099.getClass(), "totalReMasterSync", 73090103);
        setLongField(term4247099, term4247099.getClass(), "totalAchievement", 4865075946665677062L);
        setLongField(term4247099, term4247099.getClass(), "totalBasicAchievement", -5481223525603756797L);
        setLongField(term4247099, term4247099.getClass(), "totalAdvancedAchievement", 8587635178146311485L);
        setLongField(term4247099, term4247099.getClass(), "totalExpertAchievement", 446668820852283924L);
        setLongField(term4247099, term4247099.getClass(), "totalMasterAchievement", 2943530367526861064L);
        setLongField(term4247099, term4247099.getClass(), "totalReMasterAchievement", 706089054504560220L);
        setLongField(term4247099, term4247099.getClass(), "playerOldRating", -5432337019602957137L);
        setLongField(term4247099, term4247099.getClass(), "playerNewRating", -5082689456237635985L);
        setIntField(term4247099, term4247099.getClass(), "banState", 206063710);
        setLongField(term4247099, term4247099.getClass(), "dateTime", 2195722001079737158L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term4247099, args);
    }

};


