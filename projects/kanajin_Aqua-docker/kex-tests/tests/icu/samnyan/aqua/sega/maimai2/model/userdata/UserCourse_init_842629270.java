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

public class UserCourse_init_842629270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70880;

    public UserCourse_init_842629270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term70884 = new Long(1667122142089513324L);
        Integer term70947 = new Integer(-203163250);
        ArrayList term70945 = new ArrayList();
        ((ArrayList) term70945).add(term70947);
        Integer term70953 = new Integer(498473526);
        Integer term70955 = new Integer(1186917020);
        Integer term70957 = new Integer(1670041824);
        Integer term70959 = new Integer(2140388634);
        Integer term70961 = new Integer(21095258);
        ArrayList term70951 = new ArrayList();
        ((ArrayList) term70951).add(term70953);
        ((ArrayList) term70951).add(term70955);
        ((ArrayList) term70951).add(term70957);
        ((ArrayList) term70951).add(term70959);
        ((ArrayList) term70951).add(term70961);
        term70880 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term70882 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term70898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70903 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70913 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term70880, term70880.getClass(), "id", 8895118820871384465L);
        setLongField(term70882, term70882.getClass(), "id", -1133623154868596434L);
        setField(term70882, term70882.getClass(), "extId", term70884);
        setField(term70882, term70882.getClass(), "luid", "gcKmFclftu");
        setIntField(term70899, term70899.getClass(), "year", 2027);
        setShortField(term70899, term70899.getClass(), "month", (short) 8);
        setShortField(term70899, term70899.getClass(), "day", (short) 16);
        setField(term70898, term70898.getClass(), "date", term70899);
        setByteField(term70903, term70903.getClass(), "hour", (byte) 8);
        setByteField(term70903, term70903.getClass(), "minute", (byte) 3);
        setByteField(term70903, term70903.getClass(), "second", (byte) 15);
        setIntField(term70903, term70903.getClass(), "nano", 332963320);
        setField(term70898, term70898.getClass(), "time", term70903);
        setField(term70882, term70882.getClass(), "registerTime", term70898);
        setIntField(term70909, term70909.getClass(), "year", 2021);
        setShortField(term70909, term70909.getClass(), "month", (short) 11);
        setShortField(term70909, term70909.getClass(), "day", (short) 12);
        setField(term70908, term70908.getClass(), "date", term70909);
        setByteField(term70913, term70913.getClass(), "hour", (byte) 0);
        setByteField(term70913, term70913.getClass(), "minute", (byte) 51);
        setByteField(term70913, term70913.getClass(), "second", (byte) 55);
        setIntField(term70913, term70913.getClass(), "nano", 745543124);
        setField(term70908, term70908.getClass(), "time", term70913);
        setField(term70882, term70882.getClass(), "accessTime", term70908);
        setField(term70880, term70880.getClass(), "card", term70882);
        setField(term70880, term70880.getClass(), "userName", "lfREOBPEuD");
        setIntField(term70880, term70880.getClass(), "isNetMember", 926936251);
        setIntField(term70880, term70880.getClass(), "iconId", -1700257563);
        setIntField(term70880, term70880.getClass(), "plateId", 1981729571);
        setIntField(term70880, term70880.getClass(), "titleId", 127533420);
        setIntField(term70880, term70880.getClass(), "partnerId", -426467178);
        setIntField(term70880, term70880.getClass(), "frameId", 1659957838);
        setIntField(term70880, term70880.getClass(), "selectMapId", 1323889329);
        setIntField(term70880, term70880.getClass(), "totalAwake", -343106345);
        setIntField(term70880, term70880.getClass(), "gradeRating", 602906952);
        setIntField(term70880, term70880.getClass(), "musicRating", -114450920);
        setIntField(term70880, term70880.getClass(), "playerRating", -1252187988);
        setIntField(term70880, term70880.getClass(), "highestRating", -81147170);
        setIntField(term70880, term70880.getClass(), "gradeRank", -1351264521);
        setIntField(term70880, term70880.getClass(), "classRank", 1756335526);
        setIntField(term70880, term70880.getClass(), "courseRank", 1520765805);
        setField(term70880, term70880.getClass(), "charaSlot", term70945);
        setField(term70880, term70880.getClass(), "charaLockSlot", term70951);
        setLongField(term70880, term70880.getClass(), "contentBit", -7907370981376515453L);
        setIntField(term70880, term70880.getClass(), "playCount", -1583406430);
        setField(term70880, term70880.getClass(), "eventWatchedDate", "JAGjDlTwTa");
        setField(term70880, term70880.getClass(), "lastGameId", "wIDeyLnekQ");
        setField(term70880, term70880.getClass(), "lastRomVersion", "tOGPTIqSMm");
        setField(term70880, term70880.getClass(), "lastDataVersion", "cFwZnaLmLP");
        setField(term70880, term70880.getClass(), "lastLoginDate", "cBtfnWBMkE");
        setField(term70880, term70880.getClass(), "lastPlayDate", "sFixkFlMhw");
        setIntField(term70880, term70880.getClass(), "lastPlayCredit", -362377365);
        setIntField(term70880, term70880.getClass(), "lastPlayMode", -1066899178);
        setIntField(term70880, term70880.getClass(), "lastPlaceId", -375367032);
        setField(term70880, term70880.getClass(), "lastPlaceName", "wNaCYPwDGZ");
        setIntField(term70880, term70880.getClass(), "lastAllNetId", 947865229);
        setIntField(term70880, term70880.getClass(), "lastRegionId", 669536206);
        setField(term70880, term70880.getClass(), "lastRegionName", "CFojehEtAR");
        setField(term70880, term70880.getClass(), "lastClientId", "EYeLeoxDrM");
        setField(term70880, term70880.getClass(), "lastCountryCode", "zIPJJJubgX");
        setIntField(term70880, term70880.getClass(), "lastSelectEMoney", 1462009781);
        setIntField(term70880, term70880.getClass(), "lastSelectTicket", 1888180272);
        setIntField(term70880, term70880.getClass(), "lastSelectCourse", 122373099);
        setIntField(term70880, term70880.getClass(), "lastCountCourse", 1523613362);
        setField(term70880, term70880.getClass(), "firstGameId", "WRbxmSFTaO");
        setField(term70880, term70880.getClass(), "firstRomVersion", "ZekQCuvPXT");
        setField(term70880, term70880.getClass(), "firstDataVersion", "GUXdlpmVNQ");
        setField(term70880, term70880.getClass(), "firstPlayDate", "QxSwOpnogl");
        setField(term70880, term70880.getClass(), "compatibleCmVersion", "wXeTrDfRqa");
        setField(term70880, term70880.getClass(), "dailyBonusDate", "QsFsmwqvwM");
        setField(term70880, term70880.getClass(), "dailyCourseBonusDate", "pSDSdAjceB");
        setField(term70880, term70880.getClass(), "lastPairLoginDate", "TGMaCYOqml");
        setField(term70880, term70880.getClass(), "lastTrialPlayDate", "btqCBRPcNd");
        setIntField(term70880, term70880.getClass(), "playVsCount", -534854731);
        setIntField(term70880, term70880.getClass(), "playSyncCount", 974443737);
        setIntField(term70880, term70880.getClass(), "winCount", 1870256063);
        setIntField(term70880, term70880.getClass(), "helpCount", -1476089256);
        setIntField(term70880, term70880.getClass(), "comboCount", -1574154979);
        setLongField(term70880, term70880.getClass(), "totalDeluxscore", 912529279953387872L);
        setLongField(term70880, term70880.getClass(), "totalBasicDeluxscore", 6140052465174132392L);
        setLongField(term70880, term70880.getClass(), "totalAdvancedDeluxscore", 3429269088703450074L);
        setLongField(term70880, term70880.getClass(), "totalExpertDeluxscore", 5075494854539116407L);
        setLongField(term70880, term70880.getClass(), "totalMasterDeluxscore", -1836910095716864258L);
        setLongField(term70880, term70880.getClass(), "totalReMasterDeluxscore", 6409577068638937956L);
        setIntField(term70880, term70880.getClass(), "totalSync", -1283710689);
        setIntField(term70880, term70880.getClass(), "totalBasicSync", -336745260);
        setIntField(term70880, term70880.getClass(), "totalAdvancedSync", -100110545);
        setIntField(term70880, term70880.getClass(), "totalExpertSync", 891852800);
        setIntField(term70880, term70880.getClass(), "totalMasterSync", -1015397914);
        setIntField(term70880, term70880.getClass(), "totalReMasterSync", -532093166);
        setLongField(term70880, term70880.getClass(), "totalAchievement", -1680886152207238363L);
        setLongField(term70880, term70880.getClass(), "totalBasicAchievement", 1147867669908260197L);
        setLongField(term70880, term70880.getClass(), "totalAdvancedAchievement", -4547752041588255808L);
        setLongField(term70880, term70880.getClass(), "totalExpertAchievement", -3197677601690573647L);
        setLongField(term70880, term70880.getClass(), "totalMasterAchievement", 6425336229882388159L);
        setLongField(term70880, term70880.getClass(), "totalReMasterAchievement", -616423180949048118L);
        setLongField(term70880, term70880.getClass(), "playerOldRating", -8090281978105887179L);
        setLongField(term70880, term70880.getClass(), "playerNewRating", -5381866975637720642L);
        setIntField(term70880, term70880.getClass(), "banState", -1607646566);
        setLongField(term70880, term70880.getClass(), "dateTime", -3951751659567091652L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term70880;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


