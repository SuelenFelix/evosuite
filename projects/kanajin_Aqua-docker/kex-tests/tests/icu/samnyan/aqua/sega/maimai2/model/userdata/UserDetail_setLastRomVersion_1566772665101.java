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

public class UserDetail_setLastRomVersion_1566772665101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252821;

    public UserDetail_setLastRomVersion_1566772665101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term252825 = new Long(-2614906266506360948L);
        Integer term252888 = new Integer(-1134516117);
        Integer term252890 = new Integer(1618532335);
        Integer term252892 = new Integer(1620043047);
        ArrayList term252886 = new ArrayList();
        ((ArrayList) term252886).add(term252888);
        ((ArrayList) term252886).add(term252890);
        ((ArrayList) term252886).add(term252892);
        Integer term252898 = new Integer(-1329172198);
        Integer term252900 = new Integer(-1036092775);
        Integer term252902 = new Integer(857844283);
        Integer term252904 = new Integer(559778075);
        Integer term252906 = new Integer(188273941);
        Integer term252908 = new Integer(736020163);
        Integer term252910 = new Integer(1233013986);
        Integer term252912 = new Integer(342111166);
        Integer term252914 = new Integer(-846825115);
        ArrayList term252896 = new ArrayList();
        ((ArrayList) term252896).add(term252898);
        ((ArrayList) term252896).add(term252900);
        ((ArrayList) term252896).add(term252902);
        ((ArrayList) term252896).add(term252904);
        ((ArrayList) term252896).add(term252906);
        ((ArrayList) term252896).add(term252908);
        ((ArrayList) term252896).add(term252910);
        ((ArrayList) term252896).add(term252912);
        ((ArrayList) term252896).add(term252914);
        term252821 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term252823 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term252839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252844 = newInstance(Class.forName("java.time.LocalTime"));
        Object term252849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252854 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term252821, term252821.getClass(), "id", 4479338760616305189L);
        setLongField(term252823, term252823.getClass(), "id", -8212249574813398720L);
        setField(term252823, term252823.getClass(), "extId", term252825);
        setField(term252823, term252823.getClass(), "luid", "PPTHZyWzja");
        setIntField(term252840, term252840.getClass(), "year", 2014);
        setShortField(term252840, term252840.getClass(), "month", (short) 4);
        setShortField(term252840, term252840.getClass(), "day", (short) 29);
        setField(term252839, term252839.getClass(), "date", term252840);
        setByteField(term252844, term252844.getClass(), "hour", (byte) 11);
        setByteField(term252844, term252844.getClass(), "minute", (byte) 34);
        setByteField(term252844, term252844.getClass(), "second", (byte) 37);
        setIntField(term252844, term252844.getClass(), "nano", 983028354);
        setField(term252839, term252839.getClass(), "time", term252844);
        setField(term252823, term252823.getClass(), "registerTime", term252839);
        setIntField(term252850, term252850.getClass(), "year", 2029);
        setShortField(term252850, term252850.getClass(), "month", (short) 7);
        setShortField(term252850, term252850.getClass(), "day", (short) 3);
        setField(term252849, term252849.getClass(), "date", term252850);
        setByteField(term252854, term252854.getClass(), "hour", (byte) 18);
        setByteField(term252854, term252854.getClass(), "minute", (byte) 33);
        setByteField(term252854, term252854.getClass(), "second", (byte) 32);
        setIntField(term252854, term252854.getClass(), "nano", 464450762);
        setField(term252849, term252849.getClass(), "time", term252854);
        setField(term252823, term252823.getClass(), "accessTime", term252849);
        setField(term252821, term252821.getClass(), "card", term252823);
        setField(term252821, term252821.getClass(), "userName", "lkrEjOUbOb");
        setIntField(term252821, term252821.getClass(), "isNetMember", -1690092644);
        setIntField(term252821, term252821.getClass(), "iconId", 256360318);
        setIntField(term252821, term252821.getClass(), "plateId", 236819556);
        setIntField(term252821, term252821.getClass(), "titleId", -130760963);
        setIntField(term252821, term252821.getClass(), "partnerId", 1408650907);
        setIntField(term252821, term252821.getClass(), "frameId", 1098819430);
        setIntField(term252821, term252821.getClass(), "selectMapId", 2056518673);
        setIntField(term252821, term252821.getClass(), "totalAwake", 1515488022);
        setIntField(term252821, term252821.getClass(), "gradeRating", 562473019);
        setIntField(term252821, term252821.getClass(), "musicRating", -1080448263);
        setIntField(term252821, term252821.getClass(), "playerRating", 1351965644);
        setIntField(term252821, term252821.getClass(), "highestRating", 1883549199);
        setIntField(term252821, term252821.getClass(), "gradeRank", 314097266);
        setIntField(term252821, term252821.getClass(), "classRank", -1445743731);
        setIntField(term252821, term252821.getClass(), "courseRank", -905630109);
        setField(term252821, term252821.getClass(), "charaSlot", term252886);
        setField(term252821, term252821.getClass(), "charaLockSlot", term252896);
        setLongField(term252821, term252821.getClass(), "contentBit", 2668491820081353748L);
        setIntField(term252821, term252821.getClass(), "playCount", -155595665);
        setField(term252821, term252821.getClass(), "eventWatchedDate", "cxeaGVfqIZ");
        setField(term252821, term252821.getClass(), "lastGameId", "PduAQEEVJs");
        setField(term252821, term252821.getClass(), "lastRomVersion", "DEzXMDcBeO");
        setField(term252821, term252821.getClass(), "lastDataVersion", "omCAhxkVhc");
        setField(term252821, term252821.getClass(), "lastLoginDate", "BYmfYmCPCO");
        setField(term252821, term252821.getClass(), "lastPlayDate", "czTcTFSZaH");
        setIntField(term252821, term252821.getClass(), "lastPlayCredit", -1018854308);
        setIntField(term252821, term252821.getClass(), "lastPlayMode", 1990277039);
        setIntField(term252821, term252821.getClass(), "lastPlaceId", 95013950);
        setField(term252821, term252821.getClass(), "lastPlaceName", "xoGaXvlJPi");
        setIntField(term252821, term252821.getClass(), "lastAllNetId", 1625257088);
        setIntField(term252821, term252821.getClass(), "lastRegionId", 1729285490);
        setField(term252821, term252821.getClass(), "lastRegionName", "YTuxwCMRBA");
        setField(term252821, term252821.getClass(), "lastClientId", "sETkaSuzDp");
        setField(term252821, term252821.getClass(), "lastCountryCode", "lZBpPKYhfN");
        setIntField(term252821, term252821.getClass(), "lastSelectEMoney", -289198012);
        setIntField(term252821, term252821.getClass(), "lastSelectTicket", -1733483597);
        setIntField(term252821, term252821.getClass(), "lastSelectCourse", 926038542);
        setIntField(term252821, term252821.getClass(), "lastCountCourse", -1364054021);
        setField(term252821, term252821.getClass(), "firstGameId", "QurcwJtnIZ");
        setField(term252821, term252821.getClass(), "firstRomVersion", "hkknNIOuCb");
        setField(term252821, term252821.getClass(), "firstDataVersion", "nDBGVJQKYa");
        setField(term252821, term252821.getClass(), "firstPlayDate", "vibSudGWEW");
        setField(term252821, term252821.getClass(), "compatibleCmVersion", "rZCRybHPmf");
        setField(term252821, term252821.getClass(), "dailyBonusDate", "dWFHxHnzji");
        setField(term252821, term252821.getClass(), "dailyCourseBonusDate", "onRbsuWQtT");
        setField(term252821, term252821.getClass(), "lastPairLoginDate", "quIfJIsZRI");
        setField(term252821, term252821.getClass(), "lastTrialPlayDate", "haGlFmKzph");
        setIntField(term252821, term252821.getClass(), "playVsCount", -776881167);
        setIntField(term252821, term252821.getClass(), "playSyncCount", -1224727911);
        setIntField(term252821, term252821.getClass(), "winCount", 1193187950);
        setIntField(term252821, term252821.getClass(), "helpCount", -507045182);
        setIntField(term252821, term252821.getClass(), "comboCount", -461171524);
        setLongField(term252821, term252821.getClass(), "totalDeluxscore", 5498908912080219513L);
        setLongField(term252821, term252821.getClass(), "totalBasicDeluxscore", -6195651746642771427L);
        setLongField(term252821, term252821.getClass(), "totalAdvancedDeluxscore", 488332942012422736L);
        setLongField(term252821, term252821.getClass(), "totalExpertDeluxscore", 5730805468571856176L);
        setLongField(term252821, term252821.getClass(), "totalMasterDeluxscore", -5717737321194109274L);
        setLongField(term252821, term252821.getClass(), "totalReMasterDeluxscore", -6262475645319382074L);
        setIntField(term252821, term252821.getClass(), "totalSync", -1215126246);
        setIntField(term252821, term252821.getClass(), "totalBasicSync", 852763841);
        setIntField(term252821, term252821.getClass(), "totalAdvancedSync", -389279224);
        setIntField(term252821, term252821.getClass(), "totalExpertSync", 412728307);
        setIntField(term252821, term252821.getClass(), "totalMasterSync", 907738573);
        setIntField(term252821, term252821.getClass(), "totalReMasterSync", -504601990);
        setLongField(term252821, term252821.getClass(), "totalAchievement", 1902357826541237652L);
        setLongField(term252821, term252821.getClass(), "totalBasicAchievement", -8645462243836436411L);
        setLongField(term252821, term252821.getClass(), "totalAdvancedAchievement", 6265701797442870633L);
        setLongField(term252821, term252821.getClass(), "totalExpertAchievement", -887446837345795672L);
        setLongField(term252821, term252821.getClass(), "totalMasterAchievement", 4925874220794018547L);
        setLongField(term252821, term252821.getClass(), "totalReMasterAchievement", 1660936978354244191L);
        setLongField(term252821, term252821.getClass(), "playerOldRating", -6915278764055358210L);
        setLongField(term252821, term252821.getClass(), "playerNewRating", -5885217021368172173L);
        setIntField(term252821, term252821.getClass(), "banState", 179980220);
        setLongField(term252821, term252821.getClass(), "dateTime", -6467419163349797863L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FNvjIZLJdX";
        callMethod(klass, "setLastRomVersion", argTypes, term252821, args);
    }

};


