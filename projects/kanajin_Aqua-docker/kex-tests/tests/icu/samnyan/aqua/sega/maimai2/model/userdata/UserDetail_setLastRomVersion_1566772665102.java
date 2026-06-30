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

public class UserDetail_setLastRomVersion_1566772665102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252876;

    public UserDetail_setLastRomVersion_1566772665102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term252880 = new Long(-2614906266506360948L);
        Integer term252943 = new Integer(-1134516117);
        Integer term252945 = new Integer(1618532335);
        Integer term252947 = new Integer(1620043047);
        ArrayList term252941 = new ArrayList();
        ((ArrayList) term252941).add(term252943);
        ((ArrayList) term252941).add(term252945);
        ((ArrayList) term252941).add(term252947);
        Integer term252953 = new Integer(-1329172198);
        Integer term252955 = new Integer(-1036092775);
        Integer term252957 = new Integer(857844283);
        Integer term252959 = new Integer(559778075);
        Integer term252961 = new Integer(188273941);
        Integer term252963 = new Integer(736020163);
        Integer term252965 = new Integer(1233013986);
        Integer term252967 = new Integer(342111166);
        Integer term252969 = new Integer(-846825115);
        ArrayList term252951 = new ArrayList();
        ((ArrayList) term252951).add(term252953);
        ((ArrayList) term252951).add(term252955);
        ((ArrayList) term252951).add(term252957);
        ((ArrayList) term252951).add(term252959);
        ((ArrayList) term252951).add(term252961);
        ((ArrayList) term252951).add(term252963);
        ((ArrayList) term252951).add(term252965);
        ((ArrayList) term252951).add(term252967);
        ((ArrayList) term252951).add(term252969);
        term252876 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term252878 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term252894 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252895 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252899 = newInstance(Class.forName("java.time.LocalTime"));
        Object term252904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252909 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term252876, term252876.getClass(), "id", 4479338760616305189L);
        setLongField(term252878, term252878.getClass(), "id", -8212249574813398720L);
        setField(term252878, term252878.getClass(), "extId", term252880);
        setField(term252878, term252878.getClass(), "luid", "PPTHZyWzja");
        setIntField(term252895, term252895.getClass(), "year", 2014);
        setShortField(term252895, term252895.getClass(), "month", (short) 4);
        setShortField(term252895, term252895.getClass(), "day", (short) 29);
        setField(term252894, term252894.getClass(), "date", term252895);
        setByteField(term252899, term252899.getClass(), "hour", (byte) 11);
        setByteField(term252899, term252899.getClass(), "minute", (byte) 34);
        setByteField(term252899, term252899.getClass(), "second", (byte) 37);
        setIntField(term252899, term252899.getClass(), "nano", 983028354);
        setField(term252894, term252894.getClass(), "time", term252899);
        setField(term252878, term252878.getClass(), "registerTime", term252894);
        setIntField(term252905, term252905.getClass(), "year", 2029);
        setShortField(term252905, term252905.getClass(), "month", (short) 7);
        setShortField(term252905, term252905.getClass(), "day", (short) 3);
        setField(term252904, term252904.getClass(), "date", term252905);
        setByteField(term252909, term252909.getClass(), "hour", (byte) 18);
        setByteField(term252909, term252909.getClass(), "minute", (byte) 33);
        setByteField(term252909, term252909.getClass(), "second", (byte) 32);
        setIntField(term252909, term252909.getClass(), "nano", 464450762);
        setField(term252904, term252904.getClass(), "time", term252909);
        setField(term252878, term252878.getClass(), "accessTime", term252904);
        setField(term252876, term252876.getClass(), "card", term252878);
        setField(term252876, term252876.getClass(), "userName", "lkrEjOUbOb");
        setIntField(term252876, term252876.getClass(), "isNetMember", -1690092644);
        setIntField(term252876, term252876.getClass(), "iconId", 256360318);
        setIntField(term252876, term252876.getClass(), "plateId", 236819556);
        setIntField(term252876, term252876.getClass(), "titleId", -130760963);
        setIntField(term252876, term252876.getClass(), "partnerId", 1408650907);
        setIntField(term252876, term252876.getClass(), "frameId", 1098819430);
        setIntField(term252876, term252876.getClass(), "selectMapId", 2056518673);
        setIntField(term252876, term252876.getClass(), "totalAwake", 1515488022);
        setIntField(term252876, term252876.getClass(), "gradeRating", 562473019);
        setIntField(term252876, term252876.getClass(), "musicRating", -1080448263);
        setIntField(term252876, term252876.getClass(), "playerRating", 1351965644);
        setIntField(term252876, term252876.getClass(), "highestRating", 1883549199);
        setIntField(term252876, term252876.getClass(), "gradeRank", 314097266);
        setIntField(term252876, term252876.getClass(), "classRank", -1445743731);
        setIntField(term252876, term252876.getClass(), "courseRank", -905630109);
        setField(term252876, term252876.getClass(), "charaSlot", term252941);
        setField(term252876, term252876.getClass(), "charaLockSlot", term252951);
        setLongField(term252876, term252876.getClass(), "contentBit", 2668491820081353748L);
        setIntField(term252876, term252876.getClass(), "playCount", -155595665);
        setField(term252876, term252876.getClass(), "eventWatchedDate", "cxeaGVfqIZ");
        setField(term252876, term252876.getClass(), "lastGameId", "PduAQEEVJs");
        setField(term252876, term252876.getClass(), "lastRomVersion", "DEzXMDcBeO");
        setField(term252876, term252876.getClass(), "lastDataVersion", "omCAhxkVhc");
        setField(term252876, term252876.getClass(), "lastLoginDate", "BYmfYmCPCO");
        setField(term252876, term252876.getClass(), "lastPlayDate", "czTcTFSZaH");
        setIntField(term252876, term252876.getClass(), "lastPlayCredit", -1018854308);
        setIntField(term252876, term252876.getClass(), "lastPlayMode", 1990277039);
        setIntField(term252876, term252876.getClass(), "lastPlaceId", 95013950);
        setField(term252876, term252876.getClass(), "lastPlaceName", "xoGaXvlJPi");
        setIntField(term252876, term252876.getClass(), "lastAllNetId", 1625257088);
        setIntField(term252876, term252876.getClass(), "lastRegionId", 1729285490);
        setField(term252876, term252876.getClass(), "lastRegionName", "YTuxwCMRBA");
        setField(term252876, term252876.getClass(), "lastClientId", "sETkaSuzDp");
        setField(term252876, term252876.getClass(), "lastCountryCode", "lZBpPKYhfN");
        setIntField(term252876, term252876.getClass(), "lastSelectEMoney", -289198012);
        setIntField(term252876, term252876.getClass(), "lastSelectTicket", -1733483597);
        setIntField(term252876, term252876.getClass(), "lastSelectCourse", 926038542);
        setIntField(term252876, term252876.getClass(), "lastCountCourse", -1364054021);
        setField(term252876, term252876.getClass(), "firstGameId", "QurcwJtnIZ");
        setField(term252876, term252876.getClass(), "firstRomVersion", "hkknNIOuCb");
        setField(term252876, term252876.getClass(), "firstDataVersion", "nDBGVJQKYa");
        setField(term252876, term252876.getClass(), "firstPlayDate", "vibSudGWEW");
        setField(term252876, term252876.getClass(), "compatibleCmVersion", "rZCRybHPmf");
        setField(term252876, term252876.getClass(), "dailyBonusDate", "dWFHxHnzji");
        setField(term252876, term252876.getClass(), "dailyCourseBonusDate", "onRbsuWQtT");
        setField(term252876, term252876.getClass(), "lastPairLoginDate", "quIfJIsZRI");
        setField(term252876, term252876.getClass(), "lastTrialPlayDate", "haGlFmKzph");
        setIntField(term252876, term252876.getClass(), "playVsCount", -776881167);
        setIntField(term252876, term252876.getClass(), "playSyncCount", -1224727911);
        setIntField(term252876, term252876.getClass(), "winCount", 1193187950);
        setIntField(term252876, term252876.getClass(), "helpCount", -507045182);
        setIntField(term252876, term252876.getClass(), "comboCount", -461171524);
        setLongField(term252876, term252876.getClass(), "totalDeluxscore", 5498908912080219513L);
        setLongField(term252876, term252876.getClass(), "totalBasicDeluxscore", -6195651746642771427L);
        setLongField(term252876, term252876.getClass(), "totalAdvancedDeluxscore", 488332942012422736L);
        setLongField(term252876, term252876.getClass(), "totalExpertDeluxscore", 5730805468571856176L);
        setLongField(term252876, term252876.getClass(), "totalMasterDeluxscore", -5717737321194109274L);
        setLongField(term252876, term252876.getClass(), "totalReMasterDeluxscore", -6262475645319382074L);
        setIntField(term252876, term252876.getClass(), "totalSync", -1215126246);
        setIntField(term252876, term252876.getClass(), "totalBasicSync", 852763841);
        setIntField(term252876, term252876.getClass(), "totalAdvancedSync", -389279224);
        setIntField(term252876, term252876.getClass(), "totalExpertSync", 412728307);
        setIntField(term252876, term252876.getClass(), "totalMasterSync", 907738573);
        setIntField(term252876, term252876.getClass(), "totalReMasterSync", -504601990);
        setLongField(term252876, term252876.getClass(), "totalAchievement", 1902357826541237652L);
        setLongField(term252876, term252876.getClass(), "totalBasicAchievement", -8645462243836436411L);
        setLongField(term252876, term252876.getClass(), "totalAdvancedAchievement", 6265701797442870633L);
        setLongField(term252876, term252876.getClass(), "totalExpertAchievement", -887446837345795672L);
        setLongField(term252876, term252876.getClass(), "totalMasterAchievement", 4925874220794018547L);
        setLongField(term252876, term252876.getClass(), "totalReMasterAchievement", 1660936978354244191L);
        setLongField(term252876, term252876.getClass(), "playerOldRating", -6915278764055358210L);
        setLongField(term252876, term252876.getClass(), "playerNewRating", -5885217021368172173L);
        setIntField(term252876, term252876.getClass(), "banState", 179980220);
        setLongField(term252876, term252876.getClass(), "dateTime", -6467419163349797863L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FNvjIZLJdX";
        callMethod(klass, "setLastRomVersion", argTypes, term252876, args);
    }

};


