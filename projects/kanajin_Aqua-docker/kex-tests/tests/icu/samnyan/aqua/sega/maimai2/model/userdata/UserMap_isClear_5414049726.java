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

public class UserMap_isClear_5414049726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576674;

    public UserMap_isClear_5414049726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term576680 = new Long(-4682102699090617454L);
        Integer term576743 = new Integer(1011698169);
        ArrayList term576741 = new ArrayList();
        ((ArrayList) term576741).add(term576743);
        Integer term576749 = new Integer(-1031068823);
        Integer term576751 = new Integer(-1229282495);
        Integer term576753 = new Integer(58488326);
        Integer term576755 = new Integer(-1178011877);
        Integer term576757 = new Integer(1744976454);
        ArrayList term576747 = new ArrayList();
        ((ArrayList) term576747).add(term576749);
        ((ArrayList) term576747).add(term576751);
        ((ArrayList) term576747).add(term576753);
        ((ArrayList) term576747).add(term576755);
        ((ArrayList) term576747).add(term576757);
        term576674 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term576676 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term576678 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term576694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term576695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term576699 = newInstance(Class.forName("java.time.LocalTime"));
        Object term576704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term576705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term576709 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term576674, term576674.getClass(), "id", -8265734398475512878L);
        setLongField(term576676, term576676.getClass(), "id", -7299963212029947332L);
        setLongField(term576678, term576678.getClass(), "id", 9031910744060955307L);
        setField(term576678, term576678.getClass(), "extId", term576680);
        setField(term576678, term576678.getClass(), "luid", "ZRxIYQOsYj");
        setIntField(term576695, term576695.getClass(), "year", 2029);
        setShortField(term576695, term576695.getClass(), "month", (short) 5);
        setShortField(term576695, term576695.getClass(), "day", (short) 28);
        setField(term576694, term576694.getClass(), "date", term576695);
        setByteField(term576699, term576699.getClass(), "hour", (byte) 18);
        setByteField(term576699, term576699.getClass(), "minute", (byte) 7);
        setByteField(term576699, term576699.getClass(), "second", (byte) 17);
        setIntField(term576699, term576699.getClass(), "nano", 515979454);
        setField(term576694, term576694.getClass(), "time", term576699);
        setField(term576678, term576678.getClass(), "registerTime", term576694);
        setIntField(term576705, term576705.getClass(), "year", 2023);
        setShortField(term576705, term576705.getClass(), "month", (short) 11);
        setShortField(term576705, term576705.getClass(), "day", (short) 21);
        setField(term576704, term576704.getClass(), "date", term576705);
        setByteField(term576709, term576709.getClass(), "hour", (byte) 12);
        setByteField(term576709, term576709.getClass(), "minute", (byte) 34);
        setByteField(term576709, term576709.getClass(), "second", (byte) 57);
        setIntField(term576709, term576709.getClass(), "nano", 352635191);
        setField(term576704, term576704.getClass(), "time", term576709);
        setField(term576678, term576678.getClass(), "accessTime", term576704);
        setField(term576676, term576676.getClass(), "card", term576678);
        setField(term576676, term576676.getClass(), "userName", "menAtuBVwP");
        setIntField(term576676, term576676.getClass(), "isNetMember", 816916600);
        setIntField(term576676, term576676.getClass(), "iconId", -66159057);
        setIntField(term576676, term576676.getClass(), "plateId", 888052035);
        setIntField(term576676, term576676.getClass(), "titleId", 308042813);
        setIntField(term576676, term576676.getClass(), "partnerId", 1067384592);
        setIntField(term576676, term576676.getClass(), "frameId", 1977947600);
        setIntField(term576676, term576676.getClass(), "selectMapId", -907480724);
        setIntField(term576676, term576676.getClass(), "totalAwake", 1139919102);
        setIntField(term576676, term576676.getClass(), "gradeRating", -880014604);
        setIntField(term576676, term576676.getClass(), "musicRating", 1833293118);
        setIntField(term576676, term576676.getClass(), "playerRating", 713177849);
        setIntField(term576676, term576676.getClass(), "highestRating", -260916857);
        setIntField(term576676, term576676.getClass(), "gradeRank", 1287049092);
        setIntField(term576676, term576676.getClass(), "classRank", 991389270);
        setIntField(term576676, term576676.getClass(), "courseRank", 859411928);
        setField(term576676, term576676.getClass(), "charaSlot", term576741);
        setField(term576676, term576676.getClass(), "charaLockSlot", term576747);
        setLongField(term576676, term576676.getClass(), "contentBit", -7752062364832052173L);
        setIntField(term576676, term576676.getClass(), "playCount", 773393054);
        setField(term576676, term576676.getClass(), "eventWatchedDate", "uHcSsnCOww");
        setField(term576676, term576676.getClass(), "lastGameId", "xCjiTrDoFQ");
        setField(term576676, term576676.getClass(), "lastRomVersion", "tirNypdvIP");
        setField(term576676, term576676.getClass(), "lastDataVersion", "odnQcMQkHZ");
        setField(term576676, term576676.getClass(), "lastLoginDate", "gwrFYveSst");
        setField(term576676, term576676.getClass(), "lastPlayDate", "jkdtIYHpvk");
        setIntField(term576676, term576676.getClass(), "lastPlayCredit", -157794344);
        setIntField(term576676, term576676.getClass(), "lastPlayMode", 1977388523);
        setIntField(term576676, term576676.getClass(), "lastPlaceId", 1174087435);
        setField(term576676, term576676.getClass(), "lastPlaceName", "gAaptxMXXn");
        setIntField(term576676, term576676.getClass(), "lastAllNetId", -1788139700);
        setIntField(term576676, term576676.getClass(), "lastRegionId", -1268049403);
        setField(term576676, term576676.getClass(), "lastRegionName", "NKtsuKoITo");
        setField(term576676, term576676.getClass(), "lastClientId", "DuqoSGajvx");
        setField(term576676, term576676.getClass(), "lastCountryCode", "QKmCJSekUE");
        setIntField(term576676, term576676.getClass(), "lastSelectEMoney", 772087733);
        setIntField(term576676, term576676.getClass(), "lastSelectTicket", 817180554);
        setIntField(term576676, term576676.getClass(), "lastSelectCourse", 863477750);
        setIntField(term576676, term576676.getClass(), "lastCountCourse", 1958163104);
        setField(term576676, term576676.getClass(), "firstGameId", "vaDZuLmSLx");
        setField(term576676, term576676.getClass(), "firstRomVersion", "gpQHEHMUQj");
        setField(term576676, term576676.getClass(), "firstDataVersion", "ugIBoThFjl");
        setField(term576676, term576676.getClass(), "firstPlayDate", "kbSMKyfNDp");
        setField(term576676, term576676.getClass(), "compatibleCmVersion", "qWdFWlnTBi");
        setField(term576676, term576676.getClass(), "dailyBonusDate", "KfQfDtsdWM");
        setField(term576676, term576676.getClass(), "dailyCourseBonusDate", "bpcUPQJCSj");
        setField(term576676, term576676.getClass(), "lastPairLoginDate", "FPfjlFBUgu");
        setField(term576676, term576676.getClass(), "lastTrialPlayDate", "TKhjwVRKIu");
        setIntField(term576676, term576676.getClass(), "playVsCount", 1405468040);
        setIntField(term576676, term576676.getClass(), "playSyncCount", -1142084249);
        setIntField(term576676, term576676.getClass(), "winCount", 4890286);
        setIntField(term576676, term576676.getClass(), "helpCount", 893875328);
        setIntField(term576676, term576676.getClass(), "comboCount", -1823484472);
        setLongField(term576676, term576676.getClass(), "totalDeluxscore", 9167463215169254370L);
        setLongField(term576676, term576676.getClass(), "totalBasicDeluxscore", 6142335960026279781L);
        setLongField(term576676, term576676.getClass(), "totalAdvancedDeluxscore", 1385305071628577788L);
        setLongField(term576676, term576676.getClass(), "totalExpertDeluxscore", 1515398522337287330L);
        setLongField(term576676, term576676.getClass(), "totalMasterDeluxscore", -4097128309864071006L);
        setLongField(term576676, term576676.getClass(), "totalReMasterDeluxscore", 653551592088509416L);
        setIntField(term576676, term576676.getClass(), "totalSync", -400331981);
        setIntField(term576676, term576676.getClass(), "totalBasicSync", 1565904070);
        setIntField(term576676, term576676.getClass(), "totalAdvancedSync", 706320582);
        setIntField(term576676, term576676.getClass(), "totalExpertSync", 1676055835);
        setIntField(term576676, term576676.getClass(), "totalMasterSync", 349544864);
        setIntField(term576676, term576676.getClass(), "totalReMasterSync", 1241021862);
        setLongField(term576676, term576676.getClass(), "totalAchievement", -2942544602914343733L);
        setLongField(term576676, term576676.getClass(), "totalBasicAchievement", 3665146232913999660L);
        setLongField(term576676, term576676.getClass(), "totalAdvancedAchievement", 5387639736204141338L);
        setLongField(term576676, term576676.getClass(), "totalExpertAchievement", -5762185909056504487L);
        setLongField(term576676, term576676.getClass(), "totalMasterAchievement", -9222614286932581756L);
        setLongField(term576676, term576676.getClass(), "totalReMasterAchievement", -5871088910913146471L);
        setLongField(term576676, term576676.getClass(), "playerOldRating", 2751851787491692853L);
        setLongField(term576676, term576676.getClass(), "playerNewRating", 7370908803649039058L);
        setIntField(term576676, term576676.getClass(), "banState", -985474271);
        setLongField(term576676, term576676.getClass(), "dateTime", -3418828324351530572L);
        setField(term576674, term576674.getClass(), "user", term576676);
        setIntField(term576674, term576674.getClass(), "mapId", 82100065);
        setIntField(term576674, term576674.getClass(), "distance", -1781035161);
        setBooleanField(term576674, term576674.getClass(), "isLock", false);
        setBooleanField(term576674, term576674.getClass(), "isClear", true);
        setBooleanField(term576674, term576674.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term576674, args);
    }

};


