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

public class UserItem_setId_15918962177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36928;
     Object term37301;

    public UserItem_setId_15918962177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36934 = new Long(-1468719814009985452L);
        Integer term36997 = new Integer(-15712667);
        Integer term36999 = new Integer(1964967720);
        Integer term37001 = new Integer(1351900243);
        Integer term37003 = new Integer(-330897705);
        Integer term37005 = new Integer(1065595802);
        Integer term37007 = new Integer(21031843);
        ArrayList term36995 = new ArrayList();
        ((ArrayList) term36995).add(term36997);
        ((ArrayList) term36995).add(term36999);
        ((ArrayList) term36995).add(term37001);
        ((ArrayList) term36995).add(term37003);
        ((ArrayList) term36995).add(term37005);
        ((ArrayList) term36995).add(term37007);
        Integer term37013 = new Integer(-380787857);
        Integer term37015 = new Integer(319853052);
        Integer term37017 = new Integer(-1097563716);
        Integer term37019 = new Integer(1572907769);
        Integer term37021 = new Integer(1608016787);
        Integer term37023 = new Integer(-516303035);
        Integer term37025 = new Integer(-2143043890);
        Integer term37027 = new Integer(-2138825831);
        ArrayList term37011 = new ArrayList();
        ((ArrayList) term37011).add(term37013);
        ((ArrayList) term37011).add(term37015);
        ((ArrayList) term37011).add(term37017);
        ((ArrayList) term37011).add(term37019);
        ((ArrayList) term37011).add(term37021);
        ((ArrayList) term37011).add(term37023);
        ((ArrayList) term37011).add(term37025);
        ((ArrayList) term37011).add(term37027);
        term36928 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term36930 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term36932 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term36948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36953 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36963 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term36928, term36928.getClass(), "id", 7917622690009120321L);
        setLongField(term36930, term36930.getClass(), "id", -6651761389033452541L);
        setLongField(term36932, term36932.getClass(), "id", 7492997886327124063L);
        setField(term36932, term36932.getClass(), "extId", term36934);
        setField(term36932, term36932.getClass(), "luid", "HUtbHklGel");
        setIntField(term36949, term36949.getClass(), "year", 2029);
        setShortField(term36949, term36949.getClass(), "month", (short) 7);
        setShortField(term36949, term36949.getClass(), "day", (short) 19);
        setField(term36948, term36948.getClass(), "date", term36949);
        setByteField(term36953, term36953.getClass(), "hour", (byte) 17);
        setByteField(term36953, term36953.getClass(), "minute", (byte) 37);
        setByteField(term36953, term36953.getClass(), "second", (byte) 21);
        setIntField(term36953, term36953.getClass(), "nano", 320093277);
        setField(term36948, term36948.getClass(), "time", term36953);
        setField(term36932, term36932.getClass(), "registerTime", term36948);
        setIntField(term36959, term36959.getClass(), "year", 2028);
        setShortField(term36959, term36959.getClass(), "month", (short) 1);
        setShortField(term36959, term36959.getClass(), "day", (short) 11);
        setField(term36958, term36958.getClass(), "date", term36959);
        setByteField(term36963, term36963.getClass(), "hour", (byte) 22);
        setByteField(term36963, term36963.getClass(), "minute", (byte) 3);
        setByteField(term36963, term36963.getClass(), "second", (byte) 39);
        setIntField(term36963, term36963.getClass(), "nano", 175567313);
        setField(term36958, term36958.getClass(), "time", term36963);
        setField(term36932, term36932.getClass(), "accessTime", term36958);
        setField(term36930, term36930.getClass(), "card", term36932);
        setField(term36930, term36930.getClass(), "userName", "QbfKDAwhSB");
        setIntField(term36930, term36930.getClass(), "isNetMember", 1370328728);
        setIntField(term36930, term36930.getClass(), "iconId", 1126005767);
        setIntField(term36930, term36930.getClass(), "plateId", -1155333431);
        setIntField(term36930, term36930.getClass(), "titleId", -2110210183);
        setIntField(term36930, term36930.getClass(), "partnerId", -687531774);
        setIntField(term36930, term36930.getClass(), "frameId", -1997574107);
        setIntField(term36930, term36930.getClass(), "selectMapId", 748487022);
        setIntField(term36930, term36930.getClass(), "totalAwake", -706230330);
        setIntField(term36930, term36930.getClass(), "gradeRating", -926446006);
        setIntField(term36930, term36930.getClass(), "musicRating", 572417171);
        setIntField(term36930, term36930.getClass(), "playerRating", 46222099);
        setIntField(term36930, term36930.getClass(), "highestRating", 1985711069);
        setIntField(term36930, term36930.getClass(), "gradeRank", -1497378582);
        setIntField(term36930, term36930.getClass(), "classRank", -449740668);
        setIntField(term36930, term36930.getClass(), "courseRank", 1283268105);
        setField(term36930, term36930.getClass(), "charaSlot", term36995);
        setField(term36930, term36930.getClass(), "charaLockSlot", term37011);
        setLongField(term36930, term36930.getClass(), "contentBit", -8520099975744950197L);
        setIntField(term36930, term36930.getClass(), "playCount", -220552939);
        setField(term36930, term36930.getClass(), "eventWatchedDate", "ckTRHEIcCK");
        setField(term36930, term36930.getClass(), "lastGameId", "NYSBqIpNlD");
        setField(term36930, term36930.getClass(), "lastRomVersion", "OWglDUWQYb");
        setField(term36930, term36930.getClass(), "lastDataVersion", "FiqETbKjpv");
        setField(term36930, term36930.getClass(), "lastLoginDate", "FxXtdhhXyS");
        setField(term36930, term36930.getClass(), "lastPlayDate", "HxCEzaCcgj");
        setIntField(term36930, term36930.getClass(), "lastPlayCredit", -444257155);
        setIntField(term36930, term36930.getClass(), "lastPlayMode", -309536114);
        setIntField(term36930, term36930.getClass(), "lastPlaceId", 755500171);
        setField(term36930, term36930.getClass(), "lastPlaceName", "PDYPOQncAB");
        setIntField(term36930, term36930.getClass(), "lastAllNetId", -535062491);
        setIntField(term36930, term36930.getClass(), "lastRegionId", -147381920);
        setField(term36930, term36930.getClass(), "lastRegionName", "cHqLMqZSmc");
        setField(term36930, term36930.getClass(), "lastClientId", "hkWmAkXSOW");
        setField(term36930, term36930.getClass(), "lastCountryCode", "DwQmZEKeOp");
        setIntField(term36930, term36930.getClass(), "lastSelectEMoney", -7568006);
        setIntField(term36930, term36930.getClass(), "lastSelectTicket", 1952367361);
        setIntField(term36930, term36930.getClass(), "lastSelectCourse", -715290594);
        setIntField(term36930, term36930.getClass(), "lastCountCourse", -860371306);
        setField(term36930, term36930.getClass(), "firstGameId", "DbxrFiyttv");
        setField(term36930, term36930.getClass(), "firstRomVersion", "iVIrSxTsaM");
        setField(term36930, term36930.getClass(), "firstDataVersion", "FmJNEfmYgq");
        setField(term36930, term36930.getClass(), "firstPlayDate", "NqQofgWsJd");
        setField(term36930, term36930.getClass(), "compatibleCmVersion", "ZlVRdHsBMO");
        setField(term36930, term36930.getClass(), "dailyBonusDate", "UMMXkhuqzw");
        setField(term36930, term36930.getClass(), "dailyCourseBonusDate", "KyGXZcXJwq");
        setField(term36930, term36930.getClass(), "lastPairLoginDate", "TqiCjeuoWE");
        setField(term36930, term36930.getClass(), "lastTrialPlayDate", "GWWfkXOYLP");
        setIntField(term36930, term36930.getClass(), "playVsCount", -125626789);
        setIntField(term36930, term36930.getClass(), "playSyncCount", -309827965);
        setIntField(term36930, term36930.getClass(), "winCount", -1534471014);
        setIntField(term36930, term36930.getClass(), "helpCount", -468720148);
        setIntField(term36930, term36930.getClass(), "comboCount", 164755425);
        setLongField(term36930, term36930.getClass(), "totalDeluxscore", 3505714875198206555L);
        setLongField(term36930, term36930.getClass(), "totalBasicDeluxscore", 4923049398658802749L);
        setLongField(term36930, term36930.getClass(), "totalAdvancedDeluxscore", -6994512078037182768L);
        setLongField(term36930, term36930.getClass(), "totalExpertDeluxscore", -7497758874949135776L);
        setLongField(term36930, term36930.getClass(), "totalMasterDeluxscore", 504174293291540734L);
        setLongField(term36930, term36930.getClass(), "totalReMasterDeluxscore", -6669406542315322596L);
        setIntField(term36930, term36930.getClass(), "totalSync", 205469595);
        setIntField(term36930, term36930.getClass(), "totalBasicSync", -638606539);
        setIntField(term36930, term36930.getClass(), "totalAdvancedSync", -172607907);
        setIntField(term36930, term36930.getClass(), "totalExpertSync", 182656750);
        setIntField(term36930, term36930.getClass(), "totalMasterSync", -51407538);
        setIntField(term36930, term36930.getClass(), "totalReMasterSync", -465783748);
        setLongField(term36930, term36930.getClass(), "totalAchievement", 607455009844232907L);
        setLongField(term36930, term36930.getClass(), "totalBasicAchievement", -2171686672543976361L);
        setLongField(term36930, term36930.getClass(), "totalAdvancedAchievement", 1122196220816602891L);
        setLongField(term36930, term36930.getClass(), "totalExpertAchievement", 1006339275456792418L);
        setLongField(term36930, term36930.getClass(), "totalMasterAchievement", 7170045607484390400L);
        setLongField(term36930, term36930.getClass(), "totalReMasterAchievement", 8650489888932702486L);
        setLongField(term36930, term36930.getClass(), "playerOldRating", -723301799439650268L);
        setLongField(term36930, term36930.getClass(), "playerNewRating", 7218261959613569082L);
        setIntField(term36930, term36930.getClass(), "banState", 1780832439);
        setLongField(term36930, term36930.getClass(), "dateTime", 8997626143537750821L);
        setField(term36928, term36928.getClass(), "user", term36930);
        setIntField(term36928, term36928.getClass(), "itemKind", 1781593194);
        setIntField(term36928, term36928.getClass(), "itemId", -929366947);
        setIntField(term36928, term36928.getClass(), "stock", -10579292);
        setBooleanField(term36928, term36928.getClass(), "isValid", true);
        term37301 = new Long(-671374290989371865L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term37301;
        callMethod(klass, "setId", argTypes, term36928, args);
    }

};


