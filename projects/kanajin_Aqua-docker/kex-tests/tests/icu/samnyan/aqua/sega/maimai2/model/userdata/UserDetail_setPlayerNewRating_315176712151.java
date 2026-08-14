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
     Object term281587;
     Object term281930;

    public UserDetail_setPlayerNewRating_315176712151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term281591 = new Long(1350676497718116574L);
        Integer term281654 = new Integer(1583601182);
        Integer term281656 = new Integer(-1372040155);
        ArrayList term281652 = new ArrayList();
        ((ArrayList) term281652).add(term281654);
        ((ArrayList) term281652).add(term281656);
        ArrayList term281660 = new ArrayList();
        term281587 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term281589 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term281605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281610 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281620 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term281587, term281587.getClass(), "id", -9186517534702582457L);
        setLongField(term281589, term281589.getClass(), "id", 2811759946876340173L);
        setField(term281589, term281589.getClass(), "extId", term281591);
        setField(term281589, term281589.getClass(), "luid", "rdsQSkVsuL");
        setIntField(term281606, term281606.getClass(), "year", 2027);
        setShortField(term281606, term281606.getClass(), "month", (short) 2);
        setShortField(term281606, term281606.getClass(), "day", (short) 9);
        setField(term281605, term281605.getClass(), "date", term281606);
        setByteField(term281610, term281610.getClass(), "hour", (byte) 9);
        setByteField(term281610, term281610.getClass(), "minute", (byte) 1);
        setByteField(term281610, term281610.getClass(), "second", (byte) 14);
        setIntField(term281610, term281610.getClass(), "nano", 990366124);
        setField(term281605, term281605.getClass(), "time", term281610);
        setField(term281589, term281589.getClass(), "registerTime", term281605);
        setIntField(term281616, term281616.getClass(), "year", 2010);
        setShortField(term281616, term281616.getClass(), "month", (short) 11);
        setShortField(term281616, term281616.getClass(), "day", (short) 11);
        setField(term281615, term281615.getClass(), "date", term281616);
        setByteField(term281620, term281620.getClass(), "hour", (byte) 0);
        setByteField(term281620, term281620.getClass(), "minute", (byte) 3);
        setByteField(term281620, term281620.getClass(), "second", (byte) 1);
        setIntField(term281620, term281620.getClass(), "nano", 292262275);
        setField(term281615, term281615.getClass(), "time", term281620);
        setField(term281589, term281589.getClass(), "accessTime", term281615);
        setField(term281587, term281587.getClass(), "card", term281589);
        setField(term281587, term281587.getClass(), "userName", "EfwSeKErKM");
        setIntField(term281587, term281587.getClass(), "isNetMember", -192792309);
        setIntField(term281587, term281587.getClass(), "iconId", 1401858405);
        setIntField(term281587, term281587.getClass(), "plateId", 1188383746);
        setIntField(term281587, term281587.getClass(), "titleId", -1824758531);
        setIntField(term281587, term281587.getClass(), "partnerId", 1963639597);
        setIntField(term281587, term281587.getClass(), "frameId", -1743139715);
        setIntField(term281587, term281587.getClass(), "selectMapId", 104776467);
        setIntField(term281587, term281587.getClass(), "totalAwake", 847485505);
        setIntField(term281587, term281587.getClass(), "gradeRating", 202000883);
        setIntField(term281587, term281587.getClass(), "musicRating", 1666502127);
        setIntField(term281587, term281587.getClass(), "playerRating", 367278412);
        setIntField(term281587, term281587.getClass(), "highestRating", 465117660);
        setIntField(term281587, term281587.getClass(), "gradeRank", -379995752);
        setIntField(term281587, term281587.getClass(), "classRank", 1865503652);
        setIntField(term281587, term281587.getClass(), "courseRank", -721396613);
        setField(term281587, term281587.getClass(), "charaSlot", term281652);
        setField(term281587, term281587.getClass(), "charaLockSlot", term281660);
        setLongField(term281587, term281587.getClass(), "contentBit", 7927158439048088187L);
        setIntField(term281587, term281587.getClass(), "playCount", -1851350391);
        setField(term281587, term281587.getClass(), "eventWatchedDate", "ZgIkmfugqQ");
        setField(term281587, term281587.getClass(), "lastGameId", "NrbDMhIaRg");
        setField(term281587, term281587.getClass(), "lastRomVersion", "ccILjTbPMz");
        setField(term281587, term281587.getClass(), "lastDataVersion", "IuQgeDfBad");
        setField(term281587, term281587.getClass(), "lastLoginDate", "gkhkYpAukg");
        setField(term281587, term281587.getClass(), "lastPlayDate", "lnYIyHaqvx");
        setIntField(term281587, term281587.getClass(), "lastPlayCredit", 1793584876);
        setIntField(term281587, term281587.getClass(), "lastPlayMode", 1110805139);
        setIntField(term281587, term281587.getClass(), "lastPlaceId", -1909760986);
        setField(term281587, term281587.getClass(), "lastPlaceName", "TUcJMtBUTR");
        setIntField(term281587, term281587.getClass(), "lastAllNetId", -824204919);
        setIntField(term281587, term281587.getClass(), "lastRegionId", -1664670874);
        setField(term281587, term281587.getClass(), "lastRegionName", "rsxzwDmHat");
        setField(term281587, term281587.getClass(), "lastClientId", "xjsSGRmyFe");
        setField(term281587, term281587.getClass(), "lastCountryCode", "UbgPwxhdRe");
        setIntField(term281587, term281587.getClass(), "lastSelectEMoney", -1094900929);
        setIntField(term281587, term281587.getClass(), "lastSelectTicket", 445973950);
        setIntField(term281587, term281587.getClass(), "lastSelectCourse", -758760250);
        setIntField(term281587, term281587.getClass(), "lastCountCourse", -1801681281);
        setField(term281587, term281587.getClass(), "firstGameId", "XYnNPVUtgo");
        setField(term281587, term281587.getClass(), "firstRomVersion", "ECYpKktLoh");
        setField(term281587, term281587.getClass(), "firstDataVersion", "sXuWsHuGHf");
        setField(term281587, term281587.getClass(), "firstPlayDate", "LZvKnfYxfp");
        setField(term281587, term281587.getClass(), "compatibleCmVersion", "udsbOHcFmZ");
        setField(term281587, term281587.getClass(), "dailyBonusDate", "ocDpcoiyHj");
        setField(term281587, term281587.getClass(), "dailyCourseBonusDate", "bmilaaUMzV");
        setField(term281587, term281587.getClass(), "lastPairLoginDate", "JPhJMqQReC");
        setField(term281587, term281587.getClass(), "lastTrialPlayDate", "lcxzrQuzPN");
        setIntField(term281587, term281587.getClass(), "playVsCount", -2035346813);
        setIntField(term281587, term281587.getClass(), "playSyncCount", 1313337363);
        setIntField(term281587, term281587.getClass(), "winCount", 2048844603);
        setIntField(term281587, term281587.getClass(), "helpCount", 1415551037);
        setIntField(term281587, term281587.getClass(), "comboCount", 1254627985);
        setLongField(term281587, term281587.getClass(), "totalDeluxscore", -4067991795761822961L);
        setLongField(term281587, term281587.getClass(), "totalBasicDeluxscore", 2586622849112563310L);
        setLongField(term281587, term281587.getClass(), "totalAdvancedDeluxscore", -6448345655614352230L);
        setLongField(term281587, term281587.getClass(), "totalExpertDeluxscore", -8521415391137397756L);
        setLongField(term281587, term281587.getClass(), "totalMasterDeluxscore", 2429018471962239929L);
        setLongField(term281587, term281587.getClass(), "totalReMasterDeluxscore", -5308600297089775495L);
        setIntField(term281587, term281587.getClass(), "totalSync", 2041539083);
        setIntField(term281587, term281587.getClass(), "totalBasicSync", 528265106);
        setIntField(term281587, term281587.getClass(), "totalAdvancedSync", 958142733);
        setIntField(term281587, term281587.getClass(), "totalExpertSync", 538337335);
        setIntField(term281587, term281587.getClass(), "totalMasterSync", 1778458766);
        setIntField(term281587, term281587.getClass(), "totalReMasterSync", 1212565774);
        setLongField(term281587, term281587.getClass(), "totalAchievement", -7605663203635634491L);
        setLongField(term281587, term281587.getClass(), "totalBasicAchievement", 9054670232689896541L);
        setLongField(term281587, term281587.getClass(), "totalAdvancedAchievement", -3986477201451452982L);
        setLongField(term281587, term281587.getClass(), "totalExpertAchievement", -1200148293842134816L);
        setLongField(term281587, term281587.getClass(), "totalMasterAchievement", -6952096904380458135L);
        setLongField(term281587, term281587.getClass(), "totalReMasterAchievement", 705926681172829519L);
        setLongField(term281587, term281587.getClass(), "playerOldRating", 29812620237451263L);
        setLongField(term281587, term281587.getClass(), "playerNewRating", -5129567582417997602L);
        setIntField(term281587, term281587.getClass(), "banState", 306356949);
        setLongField(term281587, term281587.getClass(), "dateTime", -8436172309748581626L);
        term281930 = new Long(-726479122920221529L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term281930;
        callMethod(klass, "setPlayerNewRating", argTypes, term281587, args);
    }

};


