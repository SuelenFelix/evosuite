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

public class UserDetail_getLastCountCourse_170573573841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218267;

    public UserDetail_getLastCountCourse_170573573841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term218271 = new Long(9062006526792682783L);
        ArrayList term218332 = new ArrayList();
        Integer term218338 = new Integer(-2087065864);
        Integer term218340 = new Integer(-169812741);
        Integer term218342 = new Integer(-1015119737);
        Integer term218344 = new Integer(1479117665);
        ArrayList term218336 = new ArrayList();
        ((ArrayList) term218336).add(term218338);
        ((ArrayList) term218336).add(term218340);
        ((ArrayList) term218336).add(term218342);
        ((ArrayList) term218336).add(term218344);
        term218267 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term218269 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term218285 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218286 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218290 = newInstance(Class.forName("java.time.LocalTime"));
        Object term218295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218300 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term218267, term218267.getClass(), "id", 2239581449985563678L);
        setLongField(term218269, term218269.getClass(), "id", 2240412885678765814L);
        setField(term218269, term218269.getClass(), "extId", term218271);
        setField(term218269, term218269.getClass(), "luid", "NCqQFZRoRh");
        setIntField(term218286, term218286.getClass(), "year", 2017);
        setShortField(term218286, term218286.getClass(), "month", (short) 8);
        setShortField(term218286, term218286.getClass(), "day", (short) 13);
        setField(term218285, term218285.getClass(), "date", term218286);
        setByteField(term218290, term218290.getClass(), "hour", (byte) 3);
        setByteField(term218290, term218290.getClass(), "minute", (byte) 9);
        setByteField(term218290, term218290.getClass(), "second", (byte) 24);
        setIntField(term218290, term218290.getClass(), "nano", 692710591);
        setField(term218285, term218285.getClass(), "time", term218290);
        setField(term218269, term218269.getClass(), "registerTime", term218285);
        setIntField(term218296, term218296.getClass(), "year", 2019);
        setShortField(term218296, term218296.getClass(), "month", (short) 6);
        setShortField(term218296, term218296.getClass(), "day", (short) 13);
        setField(term218295, term218295.getClass(), "date", term218296);
        setByteField(term218300, term218300.getClass(), "hour", (byte) 22);
        setByteField(term218300, term218300.getClass(), "minute", (byte) 53);
        setByteField(term218300, term218300.getClass(), "second", (byte) 1);
        setIntField(term218300, term218300.getClass(), "nano", 411931015);
        setField(term218295, term218295.getClass(), "time", term218300);
        setField(term218269, term218269.getClass(), "accessTime", term218295);
        setField(term218267, term218267.getClass(), "card", term218269);
        setField(term218267, term218267.getClass(), "userName", "caEFAXcqUV");
        setIntField(term218267, term218267.getClass(), "isNetMember", 2062219450);
        setIntField(term218267, term218267.getClass(), "iconId", 1267978887);
        setIntField(term218267, term218267.getClass(), "plateId", 1628831213);
        setIntField(term218267, term218267.getClass(), "titleId", -2028140041);
        setIntField(term218267, term218267.getClass(), "partnerId", 1579670901);
        setIntField(term218267, term218267.getClass(), "frameId", -1040250853);
        setIntField(term218267, term218267.getClass(), "selectMapId", 311680987);
        setIntField(term218267, term218267.getClass(), "totalAwake", 2086480897);
        setIntField(term218267, term218267.getClass(), "gradeRating", 774843738);
        setIntField(term218267, term218267.getClass(), "musicRating", 49558267);
        setIntField(term218267, term218267.getClass(), "playerRating", -1973293496);
        setIntField(term218267, term218267.getClass(), "highestRating", 1252695742);
        setIntField(term218267, term218267.getClass(), "gradeRank", -491910666);
        setIntField(term218267, term218267.getClass(), "classRank", 968090679);
        setIntField(term218267, term218267.getClass(), "courseRank", 300152987);
        setField(term218267, term218267.getClass(), "charaSlot", term218332);
        setField(term218267, term218267.getClass(), "charaLockSlot", term218336);
        setLongField(term218267, term218267.getClass(), "contentBit", 9061850626649390314L);
        setIntField(term218267, term218267.getClass(), "playCount", 631176869);
        setField(term218267, term218267.getClass(), "eventWatchedDate", "cnkomrkpca");
        setField(term218267, term218267.getClass(), "lastGameId", "REWNHZPkuI");
        setField(term218267, term218267.getClass(), "lastRomVersion", "aeHXEFlqHA");
        setField(term218267, term218267.getClass(), "lastDataVersion", "ShZGsJrwKc");
        setField(term218267, term218267.getClass(), "lastLoginDate", "NywZZwGVsY");
        setField(term218267, term218267.getClass(), "lastPlayDate", "qssJIfsNLp");
        setIntField(term218267, term218267.getClass(), "lastPlayCredit", -1579413196);
        setIntField(term218267, term218267.getClass(), "lastPlayMode", -1296334425);
        setIntField(term218267, term218267.getClass(), "lastPlaceId", -239179118);
        setField(term218267, term218267.getClass(), "lastPlaceName", "BQaSPiJsoA");
        setIntField(term218267, term218267.getClass(), "lastAllNetId", 651097705);
        setIntField(term218267, term218267.getClass(), "lastRegionId", 249847519);
        setField(term218267, term218267.getClass(), "lastRegionName", "TitIakEOlA");
        setField(term218267, term218267.getClass(), "lastClientId", "BjBjRXrLwf");
        setField(term218267, term218267.getClass(), "lastCountryCode", "itymaoPJEQ");
        setIntField(term218267, term218267.getClass(), "lastSelectEMoney", 1938260764);
        setIntField(term218267, term218267.getClass(), "lastSelectTicket", 376902502);
        setIntField(term218267, term218267.getClass(), "lastSelectCourse", -1504091830);
        setIntField(term218267, term218267.getClass(), "lastCountCourse", 354329189);
        setField(term218267, term218267.getClass(), "firstGameId", "xDIOLqaRnk");
        setField(term218267, term218267.getClass(), "firstRomVersion", "qGYqQBLvjb");
        setField(term218267, term218267.getClass(), "firstDataVersion", "kONkqNAmba");
        setField(term218267, term218267.getClass(), "firstPlayDate", "YRdsiTXrpU");
        setField(term218267, term218267.getClass(), "compatibleCmVersion", "YNrGDtqeeu");
        setField(term218267, term218267.getClass(), "dailyBonusDate", "yPpCwkIlte");
        setField(term218267, term218267.getClass(), "dailyCourseBonusDate", "hheUdXTShH");
        setField(term218267, term218267.getClass(), "lastPairLoginDate", "qCVClBYBUv");
        setField(term218267, term218267.getClass(), "lastTrialPlayDate", "MXuaBjkZBE");
        setIntField(term218267, term218267.getClass(), "playVsCount", 337628887);
        setIntField(term218267, term218267.getClass(), "playSyncCount", -1623672019);
        setIntField(term218267, term218267.getClass(), "winCount", 748011175);
        setIntField(term218267, term218267.getClass(), "helpCount", 1872579805);
        setIntField(term218267, term218267.getClass(), "comboCount", 396945726);
        setLongField(term218267, term218267.getClass(), "totalDeluxscore", -6504788176054122914L);
        setLongField(term218267, term218267.getClass(), "totalBasicDeluxscore", 5809510607542954371L);
        setLongField(term218267, term218267.getClass(), "totalAdvancedDeluxscore", -398124435773483729L);
        setLongField(term218267, term218267.getClass(), "totalExpertDeluxscore", -3947402645604057207L);
        setLongField(term218267, term218267.getClass(), "totalMasterDeluxscore", -1184230244221177148L);
        setLongField(term218267, term218267.getClass(), "totalReMasterDeluxscore", -1109718382523354574L);
        setIntField(term218267, term218267.getClass(), "totalSync", 376449663);
        setIntField(term218267, term218267.getClass(), "totalBasicSync", -453129512);
        setIntField(term218267, term218267.getClass(), "totalAdvancedSync", 828513099);
        setIntField(term218267, term218267.getClass(), "totalExpertSync", -1918112820);
        setIntField(term218267, term218267.getClass(), "totalMasterSync", 104826972);
        setIntField(term218267, term218267.getClass(), "totalReMasterSync", -1076408006);
        setLongField(term218267, term218267.getClass(), "totalAchievement", -6560774889222308753L);
        setLongField(term218267, term218267.getClass(), "totalBasicAchievement", -6318216268001746034L);
        setLongField(term218267, term218267.getClass(), "totalAdvancedAchievement", 5701476000199713365L);
        setLongField(term218267, term218267.getClass(), "totalExpertAchievement", -4877304396721271278L);
        setLongField(term218267, term218267.getClass(), "totalMasterAchievement", 8371073346692060822L);
        setLongField(term218267, term218267.getClass(), "totalReMasterAchievement", -376589131619220909L);
        setLongField(term218267, term218267.getClass(), "playerOldRating", 2796621250659977904L);
        setLongField(term218267, term218267.getClass(), "playerNewRating", -433116873991783151L);
        setIntField(term218267, term218267.getClass(), "banState", -1344634590);
        setLongField(term218267, term218267.getClass(), "dateTime", 4550910746498457380L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountCourse", argTypes, term218267, args);
    }

};


