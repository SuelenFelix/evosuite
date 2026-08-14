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

public class UserDetail_getLastCountCourse_170573573840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218212;

    public UserDetail_getLastCountCourse_170573573840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term218216 = new Long(9062006526792682783L);
        ArrayList term218277 = new ArrayList();
        Integer term218283 = new Integer(-2087065864);
        Integer term218285 = new Integer(-169812741);
        Integer term218287 = new Integer(-1015119737);
        Integer term218289 = new Integer(1479117665);
        ArrayList term218281 = new ArrayList();
        ((ArrayList) term218281).add(term218283);
        ((ArrayList) term218281).add(term218285);
        ((ArrayList) term218281).add(term218287);
        ((ArrayList) term218281).add(term218289);
        term218212 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term218214 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term218230 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218231 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218235 = newInstance(Class.forName("java.time.LocalTime"));
        Object term218240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218245 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term218212, term218212.getClass(), "id", 2239581449985563678L);
        setLongField(term218214, term218214.getClass(), "id", 2240412885678765814L);
        setField(term218214, term218214.getClass(), "extId", term218216);
        setField(term218214, term218214.getClass(), "luid", "NCqQFZRoRh");
        setIntField(term218231, term218231.getClass(), "year", 2017);
        setShortField(term218231, term218231.getClass(), "month", (short) 8);
        setShortField(term218231, term218231.getClass(), "day", (short) 13);
        setField(term218230, term218230.getClass(), "date", term218231);
        setByteField(term218235, term218235.getClass(), "hour", (byte) 3);
        setByteField(term218235, term218235.getClass(), "minute", (byte) 9);
        setByteField(term218235, term218235.getClass(), "second", (byte) 24);
        setIntField(term218235, term218235.getClass(), "nano", 692710591);
        setField(term218230, term218230.getClass(), "time", term218235);
        setField(term218214, term218214.getClass(), "registerTime", term218230);
        setIntField(term218241, term218241.getClass(), "year", 2019);
        setShortField(term218241, term218241.getClass(), "month", (short) 6);
        setShortField(term218241, term218241.getClass(), "day", (short) 13);
        setField(term218240, term218240.getClass(), "date", term218241);
        setByteField(term218245, term218245.getClass(), "hour", (byte) 22);
        setByteField(term218245, term218245.getClass(), "minute", (byte) 53);
        setByteField(term218245, term218245.getClass(), "second", (byte) 1);
        setIntField(term218245, term218245.getClass(), "nano", 411931015);
        setField(term218240, term218240.getClass(), "time", term218245);
        setField(term218214, term218214.getClass(), "accessTime", term218240);
        setField(term218212, term218212.getClass(), "card", term218214);
        setField(term218212, term218212.getClass(), "userName", "caEFAXcqUV");
        setIntField(term218212, term218212.getClass(), "isNetMember", 2062219450);
        setIntField(term218212, term218212.getClass(), "iconId", 1267978887);
        setIntField(term218212, term218212.getClass(), "plateId", 1628831213);
        setIntField(term218212, term218212.getClass(), "titleId", -2028140041);
        setIntField(term218212, term218212.getClass(), "partnerId", 1579670901);
        setIntField(term218212, term218212.getClass(), "frameId", -1040250853);
        setIntField(term218212, term218212.getClass(), "selectMapId", 311680987);
        setIntField(term218212, term218212.getClass(), "totalAwake", 2086480897);
        setIntField(term218212, term218212.getClass(), "gradeRating", 774843738);
        setIntField(term218212, term218212.getClass(), "musicRating", 49558267);
        setIntField(term218212, term218212.getClass(), "playerRating", -1973293496);
        setIntField(term218212, term218212.getClass(), "highestRating", 1252695742);
        setIntField(term218212, term218212.getClass(), "gradeRank", -491910666);
        setIntField(term218212, term218212.getClass(), "classRank", 968090679);
        setIntField(term218212, term218212.getClass(), "courseRank", 300152987);
        setField(term218212, term218212.getClass(), "charaSlot", term218277);
        setField(term218212, term218212.getClass(), "charaLockSlot", term218281);
        setLongField(term218212, term218212.getClass(), "contentBit", 9061850626649390314L);
        setIntField(term218212, term218212.getClass(), "playCount", 631176869);
        setField(term218212, term218212.getClass(), "eventWatchedDate", "cnkomrkpca");
        setField(term218212, term218212.getClass(), "lastGameId", "REWNHZPkuI");
        setField(term218212, term218212.getClass(), "lastRomVersion", "aeHXEFlqHA");
        setField(term218212, term218212.getClass(), "lastDataVersion", "ShZGsJrwKc");
        setField(term218212, term218212.getClass(), "lastLoginDate", "NywZZwGVsY");
        setField(term218212, term218212.getClass(), "lastPlayDate", "qssJIfsNLp");
        setIntField(term218212, term218212.getClass(), "lastPlayCredit", -1579413196);
        setIntField(term218212, term218212.getClass(), "lastPlayMode", -1296334425);
        setIntField(term218212, term218212.getClass(), "lastPlaceId", -239179118);
        setField(term218212, term218212.getClass(), "lastPlaceName", "BQaSPiJsoA");
        setIntField(term218212, term218212.getClass(), "lastAllNetId", 651097705);
        setIntField(term218212, term218212.getClass(), "lastRegionId", 249847519);
        setField(term218212, term218212.getClass(), "lastRegionName", "TitIakEOlA");
        setField(term218212, term218212.getClass(), "lastClientId", "BjBjRXrLwf");
        setField(term218212, term218212.getClass(), "lastCountryCode", "itymaoPJEQ");
        setIntField(term218212, term218212.getClass(), "lastSelectEMoney", 1938260764);
        setIntField(term218212, term218212.getClass(), "lastSelectTicket", 376902502);
        setIntField(term218212, term218212.getClass(), "lastSelectCourse", -1504091830);
        setIntField(term218212, term218212.getClass(), "lastCountCourse", 354329189);
        setField(term218212, term218212.getClass(), "firstGameId", "xDIOLqaRnk");
        setField(term218212, term218212.getClass(), "firstRomVersion", "qGYqQBLvjb");
        setField(term218212, term218212.getClass(), "firstDataVersion", "kONkqNAmba");
        setField(term218212, term218212.getClass(), "firstPlayDate", "YRdsiTXrpU");
        setField(term218212, term218212.getClass(), "compatibleCmVersion", "YNrGDtqeeu");
        setField(term218212, term218212.getClass(), "dailyBonusDate", "yPpCwkIlte");
        setField(term218212, term218212.getClass(), "dailyCourseBonusDate", "hheUdXTShH");
        setField(term218212, term218212.getClass(), "lastPairLoginDate", "qCVClBYBUv");
        setField(term218212, term218212.getClass(), "lastTrialPlayDate", "MXuaBjkZBE");
        setIntField(term218212, term218212.getClass(), "playVsCount", 337628887);
        setIntField(term218212, term218212.getClass(), "playSyncCount", -1623672019);
        setIntField(term218212, term218212.getClass(), "winCount", 748011175);
        setIntField(term218212, term218212.getClass(), "helpCount", 1872579805);
        setIntField(term218212, term218212.getClass(), "comboCount", 396945726);
        setLongField(term218212, term218212.getClass(), "totalDeluxscore", -6504788176054122914L);
        setLongField(term218212, term218212.getClass(), "totalBasicDeluxscore", 5809510607542954371L);
        setLongField(term218212, term218212.getClass(), "totalAdvancedDeluxscore", -398124435773483729L);
        setLongField(term218212, term218212.getClass(), "totalExpertDeluxscore", -3947402645604057207L);
        setLongField(term218212, term218212.getClass(), "totalMasterDeluxscore", -1184230244221177148L);
        setLongField(term218212, term218212.getClass(), "totalReMasterDeluxscore", -1109718382523354574L);
        setIntField(term218212, term218212.getClass(), "totalSync", 376449663);
        setIntField(term218212, term218212.getClass(), "totalBasicSync", -453129512);
        setIntField(term218212, term218212.getClass(), "totalAdvancedSync", 828513099);
        setIntField(term218212, term218212.getClass(), "totalExpertSync", -1918112820);
        setIntField(term218212, term218212.getClass(), "totalMasterSync", 104826972);
        setIntField(term218212, term218212.getClass(), "totalReMasterSync", -1076408006);
        setLongField(term218212, term218212.getClass(), "totalAchievement", -6560774889222308753L);
        setLongField(term218212, term218212.getClass(), "totalBasicAchievement", -6318216268001746034L);
        setLongField(term218212, term218212.getClass(), "totalAdvancedAchievement", 5701476000199713365L);
        setLongField(term218212, term218212.getClass(), "totalExpertAchievement", -4877304396721271278L);
        setLongField(term218212, term218212.getClass(), "totalMasterAchievement", 8371073346692060822L);
        setLongField(term218212, term218212.getClass(), "totalReMasterAchievement", -376589131619220909L);
        setLongField(term218212, term218212.getClass(), "playerOldRating", 2796621250659977904L);
        setLongField(term218212, term218212.getClass(), "playerNewRating", -433116873991783151L);
        setIntField(term218212, term218212.getClass(), "banState", -1344634590);
        setLongField(term218212, term218212.getClass(), "dateTime", 4550910746498457380L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountCourse", argTypes, term218212, args);
    }

};


