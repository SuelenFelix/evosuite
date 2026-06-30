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

public class UserDetail_getContentBit_109489220620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4240826;

    public UserDetail_getContentBit_109489220620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4240830 = new Long(6851653249442990584L);
        Integer term4240893 = new Integer(-1703391320);
        Integer term4240895 = new Integer(-1849520734);
        Integer term4240897 = new Integer(-1641716943);
        Integer term4240899 = new Integer(-118475757);
        Integer term4240901 = new Integer(-664289577);
        Integer term4240903 = new Integer(-122644875);
        Integer term4240905 = new Integer(-2091282338);
        Integer term4240907 = new Integer(295092300);
        Integer term4240909 = new Integer(566606497);
        ArrayList term4240891 = new ArrayList();
        ((ArrayList) term4240891).add(term4240893);
        ((ArrayList) term4240891).add(term4240895);
        ((ArrayList) term4240891).add(term4240897);
        ((ArrayList) term4240891).add(term4240899);
        ((ArrayList) term4240891).add(term4240901);
        ((ArrayList) term4240891).add(term4240903);
        ((ArrayList) term4240891).add(term4240905);
        ((ArrayList) term4240891).add(term4240907);
        ((ArrayList) term4240891).add(term4240909);
        Integer term4240915 = new Integer(539575684);
        Integer term4240917 = new Integer(-164506727);
        Integer term4240919 = new Integer(-1752873646);
        Integer term4240921 = new Integer(1398762920);
        Integer term4240923 = new Integer(774063243);
        Integer term4240925 = new Integer(-99848402);
        Integer term4240927 = new Integer(1606962249);
        ArrayList term4240913 = new ArrayList();
        ((ArrayList) term4240913).add(term4240915);
        ((ArrayList) term4240913).add(term4240917);
        ((ArrayList) term4240913).add(term4240919);
        ((ArrayList) term4240913).add(term4240921);
        ((ArrayList) term4240913).add(term4240923);
        ((ArrayList) term4240913).add(term4240925);
        ((ArrayList) term4240913).add(term4240927);
        term4240826 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4240828 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4240844 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4240845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4240849 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4240854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4240855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4240859 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4240826, term4240826.getClass(), "id", 7560833364272405131L);
        setLongField(term4240828, term4240828.getClass(), "id", -607626481937292340L);
        setField(term4240828, term4240828.getClass(), "extId", term4240830);
        setField(term4240828, term4240828.getClass(), "luid", "vDzWnVJWBd");
        setIntField(term4240845, term4240845.getClass(), "year", 2023);
        setShortField(term4240845, term4240845.getClass(), "month", (short) 6);
        setShortField(term4240845, term4240845.getClass(), "day", (short) 6);
        setField(term4240844, term4240844.getClass(), "date", term4240845);
        setByteField(term4240849, term4240849.getClass(), "hour", (byte) 4);
        setByteField(term4240849, term4240849.getClass(), "minute", (byte) 6);
        setByteField(term4240849, term4240849.getClass(), "second", (byte) 14);
        setIntField(term4240849, term4240849.getClass(), "nano", 399983832);
        setField(term4240844, term4240844.getClass(), "time", term4240849);
        setField(term4240828, term4240828.getClass(), "registerTime", term4240844);
        setIntField(term4240855, term4240855.getClass(), "year", 2026);
        setShortField(term4240855, term4240855.getClass(), "month", (short) 1);
        setShortField(term4240855, term4240855.getClass(), "day", (short) 30);
        setField(term4240854, term4240854.getClass(), "date", term4240855);
        setByteField(term4240859, term4240859.getClass(), "hour", (byte) 17);
        setByteField(term4240859, term4240859.getClass(), "minute", (byte) 34);
        setByteField(term4240859, term4240859.getClass(), "second", (byte) 1);
        setIntField(term4240859, term4240859.getClass(), "nano", 586627739);
        setField(term4240854, term4240854.getClass(), "time", term4240859);
        setField(term4240828, term4240828.getClass(), "accessTime", term4240854);
        setField(term4240826, term4240826.getClass(), "card", term4240828);
        setField(term4240826, term4240826.getClass(), "userName", "ieGnaKPjTJ");
        setIntField(term4240826, term4240826.getClass(), "isNetMember", -720591784);
        setIntField(term4240826, term4240826.getClass(), "iconId", -2035988224);
        setIntField(term4240826, term4240826.getClass(), "plateId", -723092871);
        setIntField(term4240826, term4240826.getClass(), "titleId", 804656404);
        setIntField(term4240826, term4240826.getClass(), "partnerId", 1326877632);
        setIntField(term4240826, term4240826.getClass(), "frameId", -1090658780);
        setIntField(term4240826, term4240826.getClass(), "selectMapId", -1979392107);
        setIntField(term4240826, term4240826.getClass(), "totalAwake", -1537063086);
        setIntField(term4240826, term4240826.getClass(), "gradeRating", -359070940);
        setIntField(term4240826, term4240826.getClass(), "musicRating", -78884705);
        setIntField(term4240826, term4240826.getClass(), "playerRating", -434140554);
        setIntField(term4240826, term4240826.getClass(), "highestRating", 2041979206);
        setIntField(term4240826, term4240826.getClass(), "gradeRank", -2123176717);
        setIntField(term4240826, term4240826.getClass(), "classRank", -309928127);
        setIntField(term4240826, term4240826.getClass(), "courseRank", 543413576);
        setField(term4240826, term4240826.getClass(), "charaSlot", term4240891);
        setField(term4240826, term4240826.getClass(), "charaLockSlot", term4240913);
        setLongField(term4240826, term4240826.getClass(), "contentBit", 3114274173132191827L);
        setIntField(term4240826, term4240826.getClass(), "playCount", -711652950);
        setField(term4240826, term4240826.getClass(), "eventWatchedDate", "FGPrbUIKxx");
        setField(term4240826, term4240826.getClass(), "lastGameId", "gBYSQwiTVb");
        setField(term4240826, term4240826.getClass(), "lastRomVersion", "ASjNTSbZEP");
        setField(term4240826, term4240826.getClass(), "lastDataVersion", "bUFUoLtnTU");
        setField(term4240826, term4240826.getClass(), "lastLoginDate", "QpUPfcByqN");
        setField(term4240826, term4240826.getClass(), "lastPlayDate", "EuGjlnVwzf");
        setIntField(term4240826, term4240826.getClass(), "lastPlayCredit", -1862442298);
        setIntField(term4240826, term4240826.getClass(), "lastPlayMode", -2026801907);
        setIntField(term4240826, term4240826.getClass(), "lastPlaceId", 2062330543);
        setField(term4240826, term4240826.getClass(), "lastPlaceName", "iAlDWstGYw");
        setIntField(term4240826, term4240826.getClass(), "lastAllNetId", -1427115028);
        setIntField(term4240826, term4240826.getClass(), "lastRegionId", 331260429);
        setField(term4240826, term4240826.getClass(), "lastRegionName", "NKGIeGgGGS");
        setField(term4240826, term4240826.getClass(), "lastClientId", "iwtnWqxSYu");
        setField(term4240826, term4240826.getClass(), "lastCountryCode", "XMkMGIiOPN");
        setIntField(term4240826, term4240826.getClass(), "lastSelectEMoney", -1034571000);
        setIntField(term4240826, term4240826.getClass(), "lastSelectTicket", -1801245429);
        setIntField(term4240826, term4240826.getClass(), "lastSelectCourse", -1750880223);
        setIntField(term4240826, term4240826.getClass(), "lastCountCourse", 1721171690);
        setField(term4240826, term4240826.getClass(), "firstGameId", "bFnEfSZSTn");
        setField(term4240826, term4240826.getClass(), "firstRomVersion", "wCbbphCNhv");
        setField(term4240826, term4240826.getClass(), "firstDataVersion", "JqXvtxxgAf");
        setField(term4240826, term4240826.getClass(), "firstPlayDate", "uLQMLdYYDh");
        setField(term4240826, term4240826.getClass(), "compatibleCmVersion", "MVNAsqosYB");
        setField(term4240826, term4240826.getClass(), "dailyBonusDate", "fDHvOZikSo");
        setField(term4240826, term4240826.getClass(), "dailyCourseBonusDate", "FGpRVaDbRl");
        setField(term4240826, term4240826.getClass(), "lastPairLoginDate", "VibubWpqVa");
        setField(term4240826, term4240826.getClass(), "lastTrialPlayDate", "dySoLteRXp");
        setIntField(term4240826, term4240826.getClass(), "playVsCount", 1108427603);
        setIntField(term4240826, term4240826.getClass(), "playSyncCount", -1830023683);
        setIntField(term4240826, term4240826.getClass(), "winCount", -2053650886);
        setIntField(term4240826, term4240826.getClass(), "helpCount", -943384228);
        setIntField(term4240826, term4240826.getClass(), "comboCount", 1615710587);
        setLongField(term4240826, term4240826.getClass(), "totalDeluxscore", 1734637961275284185L);
        setLongField(term4240826, term4240826.getClass(), "totalBasicDeluxscore", 2447987947399613903L);
        setLongField(term4240826, term4240826.getClass(), "totalAdvancedDeluxscore", 1153712250761282285L);
        setLongField(term4240826, term4240826.getClass(), "totalExpertDeluxscore", -8417929517891541494L);
        setLongField(term4240826, term4240826.getClass(), "totalMasterDeluxscore", 6883864701400766852L);
        setLongField(term4240826, term4240826.getClass(), "totalReMasterDeluxscore", -2499816488320234872L);
        setIntField(term4240826, term4240826.getClass(), "totalSync", -1605084630);
        setIntField(term4240826, term4240826.getClass(), "totalBasicSync", -1441574796);
        setIntField(term4240826, term4240826.getClass(), "totalAdvancedSync", 1161498784);
        setIntField(term4240826, term4240826.getClass(), "totalExpertSync", -1281948656);
        setIntField(term4240826, term4240826.getClass(), "totalMasterSync", -1755792065);
        setIntField(term4240826, term4240826.getClass(), "totalReMasterSync", 1868597525);
        setLongField(term4240826, term4240826.getClass(), "totalAchievement", -341909939498078739L);
        setLongField(term4240826, term4240826.getClass(), "totalBasicAchievement", 524259020301011593L);
        setLongField(term4240826, term4240826.getClass(), "totalAdvancedAchievement", -3232415333441076182L);
        setLongField(term4240826, term4240826.getClass(), "totalExpertAchievement", 2260503732165472910L);
        setLongField(term4240826, term4240826.getClass(), "totalMasterAchievement", 3582813353806905882L);
        setLongField(term4240826, term4240826.getClass(), "totalReMasterAchievement", 7431966519524735004L);
        setLongField(term4240826, term4240826.getClass(), "playerOldRating", 5024881926208998105L);
        setLongField(term4240826, term4240826.getClass(), "playerNewRating", -6519490709594137153L);
        setIntField(term4240826, term4240826.getClass(), "banState", -494825261);
        setLongField(term4240826, term4240826.getClass(), "dateTime", 3434315990187961447L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentBit", argTypes, term4240826, args);
    }

};


