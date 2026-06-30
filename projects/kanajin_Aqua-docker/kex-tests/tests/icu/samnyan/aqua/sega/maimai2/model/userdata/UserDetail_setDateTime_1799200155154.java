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

public class UserDetail_setDateTime_1799200155154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282764;
     Object term283127;

    public UserDetail_setDateTime_1799200155154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term282768 = new Long(6323132402520425961L);
        Integer term282831 = new Integer(1415008678);
        Integer term282833 = new Integer(-768389527);
        Integer term282835 = new Integer(88636719);
        Integer term282837 = new Integer(-18572829);
        ArrayList term282829 = new ArrayList();
        ((ArrayList) term282829).add(term282831);
        ((ArrayList) term282829).add(term282833);
        ((ArrayList) term282829).add(term282835);
        ((ArrayList) term282829).add(term282837);
        Integer term282843 = new Integer(1220825104);
        Integer term282845 = new Integer(-401847632);
        Integer term282847 = new Integer(1538271896);
        Integer term282849 = new Integer(840990489);
        Integer term282851 = new Integer(-793012848);
        Integer term282853 = new Integer(-2041331473);
        Integer term282855 = new Integer(-416355601);
        Integer term282857 = new Integer(439309680);
        ArrayList term282841 = new ArrayList();
        ((ArrayList) term282841).add(term282843);
        ((ArrayList) term282841).add(term282845);
        ((ArrayList) term282841).add(term282847);
        ((ArrayList) term282841).add(term282849);
        ((ArrayList) term282841).add(term282851);
        ((ArrayList) term282841).add(term282853);
        ((ArrayList) term282841).add(term282855);
        ((ArrayList) term282841).add(term282857);
        term282764 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term282766 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term282782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282797 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term282764, term282764.getClass(), "id", 1326306072560235410L);
        setLongField(term282766, term282766.getClass(), "id", -5597819678251025282L);
        setField(term282766, term282766.getClass(), "extId", term282768);
        setField(term282766, term282766.getClass(), "luid", "fGetqfuQPh");
        setIntField(term282783, term282783.getClass(), "year", 2029);
        setShortField(term282783, term282783.getClass(), "month", (short) 7);
        setShortField(term282783, term282783.getClass(), "day", (short) 13);
        setField(term282782, term282782.getClass(), "date", term282783);
        setByteField(term282787, term282787.getClass(), "hour", (byte) 7);
        setByteField(term282787, term282787.getClass(), "minute", (byte) 34);
        setByteField(term282787, term282787.getClass(), "second", (byte) 20);
        setIntField(term282787, term282787.getClass(), "nano", 680789319);
        setField(term282782, term282782.getClass(), "time", term282787);
        setField(term282766, term282766.getClass(), "registerTime", term282782);
        setIntField(term282793, term282793.getClass(), "year", 2026);
        setShortField(term282793, term282793.getClass(), "month", (short) 11);
        setShortField(term282793, term282793.getClass(), "day", (short) 25);
        setField(term282792, term282792.getClass(), "date", term282793);
        setByteField(term282797, term282797.getClass(), "hour", (byte) 23);
        setByteField(term282797, term282797.getClass(), "minute", (byte) 11);
        setByteField(term282797, term282797.getClass(), "second", (byte) 13);
        setIntField(term282797, term282797.getClass(), "nano", 68488401);
        setField(term282792, term282792.getClass(), "time", term282797);
        setField(term282766, term282766.getClass(), "accessTime", term282792);
        setField(term282764, term282764.getClass(), "card", term282766);
        setField(term282764, term282764.getClass(), "userName", "FgmlvXIJBW");
        setIntField(term282764, term282764.getClass(), "isNetMember", -1133615279);
        setIntField(term282764, term282764.getClass(), "iconId", 626847753);
        setIntField(term282764, term282764.getClass(), "plateId", 1969584554);
        setIntField(term282764, term282764.getClass(), "titleId", 710954100);
        setIntField(term282764, term282764.getClass(), "partnerId", 2101628029);
        setIntField(term282764, term282764.getClass(), "frameId", -846852041);
        setIntField(term282764, term282764.getClass(), "selectMapId", 215045898);
        setIntField(term282764, term282764.getClass(), "totalAwake", 1273867637);
        setIntField(term282764, term282764.getClass(), "gradeRating", 1418101531);
        setIntField(term282764, term282764.getClass(), "musicRating", 769920456);
        setIntField(term282764, term282764.getClass(), "playerRating", -477204253);
        setIntField(term282764, term282764.getClass(), "highestRating", 1662398256);
        setIntField(term282764, term282764.getClass(), "gradeRank", 1766347483);
        setIntField(term282764, term282764.getClass(), "classRank", -423561050);
        setIntField(term282764, term282764.getClass(), "courseRank", 1213171057);
        setField(term282764, term282764.getClass(), "charaSlot", term282829);
        setField(term282764, term282764.getClass(), "charaLockSlot", term282841);
        setLongField(term282764, term282764.getClass(), "contentBit", -6585874542840453228L);
        setIntField(term282764, term282764.getClass(), "playCount", 1305018379);
        setField(term282764, term282764.getClass(), "eventWatchedDate", "kJeiktswgv");
        setField(term282764, term282764.getClass(), "lastGameId", "TKekvcxSzY");
        setField(term282764, term282764.getClass(), "lastRomVersion", "YEjRoxCQOP");
        setField(term282764, term282764.getClass(), "lastDataVersion", "xiwMNXuhDv");
        setField(term282764, term282764.getClass(), "lastLoginDate", "prjeAjeant");
        setField(term282764, term282764.getClass(), "lastPlayDate", "qZxkdvJOsd");
        setIntField(term282764, term282764.getClass(), "lastPlayCredit", 1128377530);
        setIntField(term282764, term282764.getClass(), "lastPlayMode", -566082419);
        setIntField(term282764, term282764.getClass(), "lastPlaceId", 507892364);
        setField(term282764, term282764.getClass(), "lastPlaceName", "ZvanAlshXP");
        setIntField(term282764, term282764.getClass(), "lastAllNetId", -1303417924);
        setIntField(term282764, term282764.getClass(), "lastRegionId", 690014633);
        setField(term282764, term282764.getClass(), "lastRegionName", "JsHqsJhBWD");
        setField(term282764, term282764.getClass(), "lastClientId", "qxayeVXQhZ");
        setField(term282764, term282764.getClass(), "lastCountryCode", "SHVaBCTtHF");
        setIntField(term282764, term282764.getClass(), "lastSelectEMoney", 887139549);
        setIntField(term282764, term282764.getClass(), "lastSelectTicket", -1974628635);
        setIntField(term282764, term282764.getClass(), "lastSelectCourse", 1927255362);
        setIntField(term282764, term282764.getClass(), "lastCountCourse", 772050796);
        setField(term282764, term282764.getClass(), "firstGameId", "FYpENSbXJU");
        setField(term282764, term282764.getClass(), "firstRomVersion", "lIbSpSPDyK");
        setField(term282764, term282764.getClass(), "firstDataVersion", "XhiuPGVKrE");
        setField(term282764, term282764.getClass(), "firstPlayDate", "SGOwXdQQSY");
        setField(term282764, term282764.getClass(), "compatibleCmVersion", "dHXclHCaUP");
        setField(term282764, term282764.getClass(), "dailyBonusDate", "NNQTRipcCv");
        setField(term282764, term282764.getClass(), "dailyCourseBonusDate", "dZhWZfUVgS");
        setField(term282764, term282764.getClass(), "lastPairLoginDate", "qMvhAPFRIy");
        setField(term282764, term282764.getClass(), "lastTrialPlayDate", "mbszMHbKhk");
        setIntField(term282764, term282764.getClass(), "playVsCount", -1285946960);
        setIntField(term282764, term282764.getClass(), "playSyncCount", 1737634703);
        setIntField(term282764, term282764.getClass(), "winCount", 793533464);
        setIntField(term282764, term282764.getClass(), "helpCount", -717365307);
        setIntField(term282764, term282764.getClass(), "comboCount", 1581920815);
        setLongField(term282764, term282764.getClass(), "totalDeluxscore", 7031143339427626397L);
        setLongField(term282764, term282764.getClass(), "totalBasicDeluxscore", -8745420300857447317L);
        setLongField(term282764, term282764.getClass(), "totalAdvancedDeluxscore", -64040951972752402L);
        setLongField(term282764, term282764.getClass(), "totalExpertDeluxscore", -6870108559944732570L);
        setLongField(term282764, term282764.getClass(), "totalMasterDeluxscore", -8966235463418520956L);
        setLongField(term282764, term282764.getClass(), "totalReMasterDeluxscore", 9000369246548657325L);
        setIntField(term282764, term282764.getClass(), "totalSync", -59811391);
        setIntField(term282764, term282764.getClass(), "totalBasicSync", -1196302168);
        setIntField(term282764, term282764.getClass(), "totalAdvancedSync", 78919121);
        setIntField(term282764, term282764.getClass(), "totalExpertSync", -526768095);
        setIntField(term282764, term282764.getClass(), "totalMasterSync", -1453641510);
        setIntField(term282764, term282764.getClass(), "totalReMasterSync", 1963023357);
        setLongField(term282764, term282764.getClass(), "totalAchievement", 2104328216902636752L);
        setLongField(term282764, term282764.getClass(), "totalBasicAchievement", -806817931626673057L);
        setLongField(term282764, term282764.getClass(), "totalAdvancedAchievement", 1321561475612142698L);
        setLongField(term282764, term282764.getClass(), "totalExpertAchievement", -6311531409882138118L);
        setLongField(term282764, term282764.getClass(), "totalMasterAchievement", 4515473697581549329L);
        setLongField(term282764, term282764.getClass(), "totalReMasterAchievement", -5412103189336277248L);
        setLongField(term282764, term282764.getClass(), "playerOldRating", 3043190021974849776L);
        setLongField(term282764, term282764.getClass(), "playerNewRating", -7221455487734525482L);
        setIntField(term282764, term282764.getClass(), "banState", -47434320);
        setLongField(term282764, term282764.getClass(), "dateTime", -6701464857654733022L);
        term283127 = new Long(6478779853968207342L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term283127;
        callMethod(klass, "setDateTime", argTypes, term282764, args);
    }

};


