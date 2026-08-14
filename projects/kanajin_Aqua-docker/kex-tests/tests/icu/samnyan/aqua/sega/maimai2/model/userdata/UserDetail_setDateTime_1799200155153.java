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

public class UserDetail_setDateTime_1799200155153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282709;
     Object term283072;

    public UserDetail_setDateTime_1799200155153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term282713 = new Long(6323132402520425961L);
        Integer term282776 = new Integer(1415008678);
        Integer term282778 = new Integer(-768389527);
        Integer term282780 = new Integer(88636719);
        Integer term282782 = new Integer(-18572829);
        ArrayList term282774 = new ArrayList();
        ((ArrayList) term282774).add(term282776);
        ((ArrayList) term282774).add(term282778);
        ((ArrayList) term282774).add(term282780);
        ((ArrayList) term282774).add(term282782);
        Integer term282788 = new Integer(1220825104);
        Integer term282790 = new Integer(-401847632);
        Integer term282792 = new Integer(1538271896);
        Integer term282794 = new Integer(840990489);
        Integer term282796 = new Integer(-793012848);
        Integer term282798 = new Integer(-2041331473);
        Integer term282800 = new Integer(-416355601);
        Integer term282802 = new Integer(439309680);
        ArrayList term282786 = new ArrayList();
        ((ArrayList) term282786).add(term282788);
        ((ArrayList) term282786).add(term282790);
        ((ArrayList) term282786).add(term282792);
        ((ArrayList) term282786).add(term282794);
        ((ArrayList) term282786).add(term282796);
        ((ArrayList) term282786).add(term282798);
        ((ArrayList) term282786).add(term282800);
        ((ArrayList) term282786).add(term282802);
        term282709 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term282711 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term282727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282732 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282737 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282738 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282742 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term282709, term282709.getClass(), "id", 1326306072560235410L);
        setLongField(term282711, term282711.getClass(), "id", -5597819678251025282L);
        setField(term282711, term282711.getClass(), "extId", term282713);
        setField(term282711, term282711.getClass(), "luid", "fGetqfuQPh");
        setIntField(term282728, term282728.getClass(), "year", 2029);
        setShortField(term282728, term282728.getClass(), "month", (short) 7);
        setShortField(term282728, term282728.getClass(), "day", (short) 13);
        setField(term282727, term282727.getClass(), "date", term282728);
        setByteField(term282732, term282732.getClass(), "hour", (byte) 7);
        setByteField(term282732, term282732.getClass(), "minute", (byte) 34);
        setByteField(term282732, term282732.getClass(), "second", (byte) 20);
        setIntField(term282732, term282732.getClass(), "nano", 680789319);
        setField(term282727, term282727.getClass(), "time", term282732);
        setField(term282711, term282711.getClass(), "registerTime", term282727);
        setIntField(term282738, term282738.getClass(), "year", 2026);
        setShortField(term282738, term282738.getClass(), "month", (short) 11);
        setShortField(term282738, term282738.getClass(), "day", (short) 25);
        setField(term282737, term282737.getClass(), "date", term282738);
        setByteField(term282742, term282742.getClass(), "hour", (byte) 23);
        setByteField(term282742, term282742.getClass(), "minute", (byte) 11);
        setByteField(term282742, term282742.getClass(), "second", (byte) 13);
        setIntField(term282742, term282742.getClass(), "nano", 68488401);
        setField(term282737, term282737.getClass(), "time", term282742);
        setField(term282711, term282711.getClass(), "accessTime", term282737);
        setField(term282709, term282709.getClass(), "card", term282711);
        setField(term282709, term282709.getClass(), "userName", "FgmlvXIJBW");
        setIntField(term282709, term282709.getClass(), "isNetMember", -1133615279);
        setIntField(term282709, term282709.getClass(), "iconId", 626847753);
        setIntField(term282709, term282709.getClass(), "plateId", 1969584554);
        setIntField(term282709, term282709.getClass(), "titleId", 710954100);
        setIntField(term282709, term282709.getClass(), "partnerId", 2101628029);
        setIntField(term282709, term282709.getClass(), "frameId", -846852041);
        setIntField(term282709, term282709.getClass(), "selectMapId", 215045898);
        setIntField(term282709, term282709.getClass(), "totalAwake", 1273867637);
        setIntField(term282709, term282709.getClass(), "gradeRating", 1418101531);
        setIntField(term282709, term282709.getClass(), "musicRating", 769920456);
        setIntField(term282709, term282709.getClass(), "playerRating", -477204253);
        setIntField(term282709, term282709.getClass(), "highestRating", 1662398256);
        setIntField(term282709, term282709.getClass(), "gradeRank", 1766347483);
        setIntField(term282709, term282709.getClass(), "classRank", -423561050);
        setIntField(term282709, term282709.getClass(), "courseRank", 1213171057);
        setField(term282709, term282709.getClass(), "charaSlot", term282774);
        setField(term282709, term282709.getClass(), "charaLockSlot", term282786);
        setLongField(term282709, term282709.getClass(), "contentBit", -6585874542840453228L);
        setIntField(term282709, term282709.getClass(), "playCount", 1305018379);
        setField(term282709, term282709.getClass(), "eventWatchedDate", "kJeiktswgv");
        setField(term282709, term282709.getClass(), "lastGameId", "TKekvcxSzY");
        setField(term282709, term282709.getClass(), "lastRomVersion", "YEjRoxCQOP");
        setField(term282709, term282709.getClass(), "lastDataVersion", "xiwMNXuhDv");
        setField(term282709, term282709.getClass(), "lastLoginDate", "prjeAjeant");
        setField(term282709, term282709.getClass(), "lastPlayDate", "qZxkdvJOsd");
        setIntField(term282709, term282709.getClass(), "lastPlayCredit", 1128377530);
        setIntField(term282709, term282709.getClass(), "lastPlayMode", -566082419);
        setIntField(term282709, term282709.getClass(), "lastPlaceId", 507892364);
        setField(term282709, term282709.getClass(), "lastPlaceName", "ZvanAlshXP");
        setIntField(term282709, term282709.getClass(), "lastAllNetId", -1303417924);
        setIntField(term282709, term282709.getClass(), "lastRegionId", 690014633);
        setField(term282709, term282709.getClass(), "lastRegionName", "JsHqsJhBWD");
        setField(term282709, term282709.getClass(), "lastClientId", "qxayeVXQhZ");
        setField(term282709, term282709.getClass(), "lastCountryCode", "SHVaBCTtHF");
        setIntField(term282709, term282709.getClass(), "lastSelectEMoney", 887139549);
        setIntField(term282709, term282709.getClass(), "lastSelectTicket", -1974628635);
        setIntField(term282709, term282709.getClass(), "lastSelectCourse", 1927255362);
        setIntField(term282709, term282709.getClass(), "lastCountCourse", 772050796);
        setField(term282709, term282709.getClass(), "firstGameId", "FYpENSbXJU");
        setField(term282709, term282709.getClass(), "firstRomVersion", "lIbSpSPDyK");
        setField(term282709, term282709.getClass(), "firstDataVersion", "XhiuPGVKrE");
        setField(term282709, term282709.getClass(), "firstPlayDate", "SGOwXdQQSY");
        setField(term282709, term282709.getClass(), "compatibleCmVersion", "dHXclHCaUP");
        setField(term282709, term282709.getClass(), "dailyBonusDate", "NNQTRipcCv");
        setField(term282709, term282709.getClass(), "dailyCourseBonusDate", "dZhWZfUVgS");
        setField(term282709, term282709.getClass(), "lastPairLoginDate", "qMvhAPFRIy");
        setField(term282709, term282709.getClass(), "lastTrialPlayDate", "mbszMHbKhk");
        setIntField(term282709, term282709.getClass(), "playVsCount", -1285946960);
        setIntField(term282709, term282709.getClass(), "playSyncCount", 1737634703);
        setIntField(term282709, term282709.getClass(), "winCount", 793533464);
        setIntField(term282709, term282709.getClass(), "helpCount", -717365307);
        setIntField(term282709, term282709.getClass(), "comboCount", 1581920815);
        setLongField(term282709, term282709.getClass(), "totalDeluxscore", 7031143339427626397L);
        setLongField(term282709, term282709.getClass(), "totalBasicDeluxscore", -8745420300857447317L);
        setLongField(term282709, term282709.getClass(), "totalAdvancedDeluxscore", -64040951972752402L);
        setLongField(term282709, term282709.getClass(), "totalExpertDeluxscore", -6870108559944732570L);
        setLongField(term282709, term282709.getClass(), "totalMasterDeluxscore", -8966235463418520956L);
        setLongField(term282709, term282709.getClass(), "totalReMasterDeluxscore", 9000369246548657325L);
        setIntField(term282709, term282709.getClass(), "totalSync", -59811391);
        setIntField(term282709, term282709.getClass(), "totalBasicSync", -1196302168);
        setIntField(term282709, term282709.getClass(), "totalAdvancedSync", 78919121);
        setIntField(term282709, term282709.getClass(), "totalExpertSync", -526768095);
        setIntField(term282709, term282709.getClass(), "totalMasterSync", -1453641510);
        setIntField(term282709, term282709.getClass(), "totalReMasterSync", 1963023357);
        setLongField(term282709, term282709.getClass(), "totalAchievement", 2104328216902636752L);
        setLongField(term282709, term282709.getClass(), "totalBasicAchievement", -806817931626673057L);
        setLongField(term282709, term282709.getClass(), "totalAdvancedAchievement", 1321561475612142698L);
        setLongField(term282709, term282709.getClass(), "totalExpertAchievement", -6311531409882138118L);
        setLongField(term282709, term282709.getClass(), "totalMasterAchievement", 4515473697581549329L);
        setLongField(term282709, term282709.getClass(), "totalReMasterAchievement", -5412103189336277248L);
        setLongField(term282709, term282709.getClass(), "playerOldRating", 3043190021974849776L);
        setLongField(term282709, term282709.getClass(), "playerNewRating", -7221455487734525482L);
        setIntField(term282709, term282709.getClass(), "banState", -47434320);
        setLongField(term282709, term282709.getClass(), "dateTime", -6701464857654733022L);
        term283072 = new Long(6478779853968207342L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term283072;
        callMethod(klass, "setDateTime", argTypes, term282709, args);
    }

};


