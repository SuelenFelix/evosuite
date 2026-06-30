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

public class UserDetail_setPlayerNewRating_315176712152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281642;
     Object term281985;

    public UserDetail_setPlayerNewRating_315176712152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term281646 = new Long(1350676497718116574L);
        Integer term281709 = new Integer(1583601182);
        Integer term281711 = new Integer(-1372040155);
        ArrayList term281707 = new ArrayList();
        ((ArrayList) term281707).add(term281709);
        ((ArrayList) term281707).add(term281711);
        ArrayList term281715 = new ArrayList();
        term281642 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term281644 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term281660 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281661 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281665 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281675 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term281642, term281642.getClass(), "id", -9186517534702582457L);
        setLongField(term281644, term281644.getClass(), "id", 2811759946876340173L);
        setField(term281644, term281644.getClass(), "extId", term281646);
        setField(term281644, term281644.getClass(), "luid", "rdsQSkVsuL");
        setIntField(term281661, term281661.getClass(), "year", 2027);
        setShortField(term281661, term281661.getClass(), "month", (short) 2);
        setShortField(term281661, term281661.getClass(), "day", (short) 9);
        setField(term281660, term281660.getClass(), "date", term281661);
        setByteField(term281665, term281665.getClass(), "hour", (byte) 9);
        setByteField(term281665, term281665.getClass(), "minute", (byte) 1);
        setByteField(term281665, term281665.getClass(), "second", (byte) 14);
        setIntField(term281665, term281665.getClass(), "nano", 990366124);
        setField(term281660, term281660.getClass(), "time", term281665);
        setField(term281644, term281644.getClass(), "registerTime", term281660);
        setIntField(term281671, term281671.getClass(), "year", 2010);
        setShortField(term281671, term281671.getClass(), "month", (short) 11);
        setShortField(term281671, term281671.getClass(), "day", (short) 11);
        setField(term281670, term281670.getClass(), "date", term281671);
        setByteField(term281675, term281675.getClass(), "hour", (byte) 0);
        setByteField(term281675, term281675.getClass(), "minute", (byte) 3);
        setByteField(term281675, term281675.getClass(), "second", (byte) 1);
        setIntField(term281675, term281675.getClass(), "nano", 292262275);
        setField(term281670, term281670.getClass(), "time", term281675);
        setField(term281644, term281644.getClass(), "accessTime", term281670);
        setField(term281642, term281642.getClass(), "card", term281644);
        setField(term281642, term281642.getClass(), "userName", "EfwSeKErKM");
        setIntField(term281642, term281642.getClass(), "isNetMember", -192792309);
        setIntField(term281642, term281642.getClass(), "iconId", 1401858405);
        setIntField(term281642, term281642.getClass(), "plateId", 1188383746);
        setIntField(term281642, term281642.getClass(), "titleId", -1824758531);
        setIntField(term281642, term281642.getClass(), "partnerId", 1963639597);
        setIntField(term281642, term281642.getClass(), "frameId", -1743139715);
        setIntField(term281642, term281642.getClass(), "selectMapId", 104776467);
        setIntField(term281642, term281642.getClass(), "totalAwake", 847485505);
        setIntField(term281642, term281642.getClass(), "gradeRating", 202000883);
        setIntField(term281642, term281642.getClass(), "musicRating", 1666502127);
        setIntField(term281642, term281642.getClass(), "playerRating", 367278412);
        setIntField(term281642, term281642.getClass(), "highestRating", 465117660);
        setIntField(term281642, term281642.getClass(), "gradeRank", -379995752);
        setIntField(term281642, term281642.getClass(), "classRank", 1865503652);
        setIntField(term281642, term281642.getClass(), "courseRank", -721396613);
        setField(term281642, term281642.getClass(), "charaSlot", term281707);
        setField(term281642, term281642.getClass(), "charaLockSlot", term281715);
        setLongField(term281642, term281642.getClass(), "contentBit", 7927158439048088187L);
        setIntField(term281642, term281642.getClass(), "playCount", -1851350391);
        setField(term281642, term281642.getClass(), "eventWatchedDate", "ZgIkmfugqQ");
        setField(term281642, term281642.getClass(), "lastGameId", "NrbDMhIaRg");
        setField(term281642, term281642.getClass(), "lastRomVersion", "ccILjTbPMz");
        setField(term281642, term281642.getClass(), "lastDataVersion", "IuQgeDfBad");
        setField(term281642, term281642.getClass(), "lastLoginDate", "gkhkYpAukg");
        setField(term281642, term281642.getClass(), "lastPlayDate", "lnYIyHaqvx");
        setIntField(term281642, term281642.getClass(), "lastPlayCredit", 1793584876);
        setIntField(term281642, term281642.getClass(), "lastPlayMode", 1110805139);
        setIntField(term281642, term281642.getClass(), "lastPlaceId", -1909760986);
        setField(term281642, term281642.getClass(), "lastPlaceName", "TUcJMtBUTR");
        setIntField(term281642, term281642.getClass(), "lastAllNetId", -824204919);
        setIntField(term281642, term281642.getClass(), "lastRegionId", -1664670874);
        setField(term281642, term281642.getClass(), "lastRegionName", "rsxzwDmHat");
        setField(term281642, term281642.getClass(), "lastClientId", "xjsSGRmyFe");
        setField(term281642, term281642.getClass(), "lastCountryCode", "UbgPwxhdRe");
        setIntField(term281642, term281642.getClass(), "lastSelectEMoney", -1094900929);
        setIntField(term281642, term281642.getClass(), "lastSelectTicket", 445973950);
        setIntField(term281642, term281642.getClass(), "lastSelectCourse", -758760250);
        setIntField(term281642, term281642.getClass(), "lastCountCourse", -1801681281);
        setField(term281642, term281642.getClass(), "firstGameId", "XYnNPVUtgo");
        setField(term281642, term281642.getClass(), "firstRomVersion", "ECYpKktLoh");
        setField(term281642, term281642.getClass(), "firstDataVersion", "sXuWsHuGHf");
        setField(term281642, term281642.getClass(), "firstPlayDate", "LZvKnfYxfp");
        setField(term281642, term281642.getClass(), "compatibleCmVersion", "udsbOHcFmZ");
        setField(term281642, term281642.getClass(), "dailyBonusDate", "ocDpcoiyHj");
        setField(term281642, term281642.getClass(), "dailyCourseBonusDate", "bmilaaUMzV");
        setField(term281642, term281642.getClass(), "lastPairLoginDate", "JPhJMqQReC");
        setField(term281642, term281642.getClass(), "lastTrialPlayDate", "lcxzrQuzPN");
        setIntField(term281642, term281642.getClass(), "playVsCount", -2035346813);
        setIntField(term281642, term281642.getClass(), "playSyncCount", 1313337363);
        setIntField(term281642, term281642.getClass(), "winCount", 2048844603);
        setIntField(term281642, term281642.getClass(), "helpCount", 1415551037);
        setIntField(term281642, term281642.getClass(), "comboCount", 1254627985);
        setLongField(term281642, term281642.getClass(), "totalDeluxscore", -4067991795761822961L);
        setLongField(term281642, term281642.getClass(), "totalBasicDeluxscore", 2586622849112563310L);
        setLongField(term281642, term281642.getClass(), "totalAdvancedDeluxscore", -6448345655614352230L);
        setLongField(term281642, term281642.getClass(), "totalExpertDeluxscore", -8521415391137397756L);
        setLongField(term281642, term281642.getClass(), "totalMasterDeluxscore", 2429018471962239929L);
        setLongField(term281642, term281642.getClass(), "totalReMasterDeluxscore", -5308600297089775495L);
        setIntField(term281642, term281642.getClass(), "totalSync", 2041539083);
        setIntField(term281642, term281642.getClass(), "totalBasicSync", 528265106);
        setIntField(term281642, term281642.getClass(), "totalAdvancedSync", 958142733);
        setIntField(term281642, term281642.getClass(), "totalExpertSync", 538337335);
        setIntField(term281642, term281642.getClass(), "totalMasterSync", 1778458766);
        setIntField(term281642, term281642.getClass(), "totalReMasterSync", 1212565774);
        setLongField(term281642, term281642.getClass(), "totalAchievement", -7605663203635634491L);
        setLongField(term281642, term281642.getClass(), "totalBasicAchievement", 9054670232689896541L);
        setLongField(term281642, term281642.getClass(), "totalAdvancedAchievement", -3986477201451452982L);
        setLongField(term281642, term281642.getClass(), "totalExpertAchievement", -1200148293842134816L);
        setLongField(term281642, term281642.getClass(), "totalMasterAchievement", -6952096904380458135L);
        setLongField(term281642, term281642.getClass(), "totalReMasterAchievement", 705926681172829519L);
        setLongField(term281642, term281642.getClass(), "playerOldRating", 29812620237451263L);
        setLongField(term281642, term281642.getClass(), "playerNewRating", -5129567582417997602L);
        setIntField(term281642, term281642.getClass(), "banState", 306356949);
        setLongField(term281642, term281642.getClass(), "dateTime", -8436172309748581626L);
        term281985 = new Long(-726479122920221529L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term281985;
        callMethod(klass, "setPlayerNewRating", argTypes, term281642, args);
    }

};


