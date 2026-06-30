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

public class UserItem_hashCode_19380755115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42059;

    public UserItem_hashCode_19380755115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42065 = new Long(2062173786000223358L);
        Integer term42128 = new Integer(1973060703);
        Integer term42130 = new Integer(-138239905);
        Integer term42132 = new Integer(1709474063);
        Integer term42134 = new Integer(1406617209);
        ArrayList term42126 = new ArrayList();
        ((ArrayList) term42126).add(term42128);
        ((ArrayList) term42126).add(term42130);
        ((ArrayList) term42126).add(term42132);
        ((ArrayList) term42126).add(term42134);
        Integer term42140 = new Integer(1706047059);
        Integer term42142 = new Integer(590451710);
        Integer term42144 = new Integer(-1999787419);
        Integer term42146 = new Integer(-1224443634);
        ArrayList term42138 = new ArrayList();
        ((ArrayList) term42138).add(term42140);
        ((ArrayList) term42138).add(term42142);
        ((ArrayList) term42138).add(term42144);
        ((ArrayList) term42138).add(term42146);
        term42059 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term42061 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term42063 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term42079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42084 = newInstance(Class.forName("java.time.LocalTime"));
        Object term42089 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42090 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42094 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term42059, term42059.getClass(), "id", 1787205862282614159L);
        setLongField(term42061, term42061.getClass(), "id", -7876013692629304244L);
        setLongField(term42063, term42063.getClass(), "id", 8129782425142702673L);
        setField(term42063, term42063.getClass(), "extId", term42065);
        setField(term42063, term42063.getClass(), "luid", "iXRAYcFyfS");
        setIntField(term42080, term42080.getClass(), "year", 2014);
        setShortField(term42080, term42080.getClass(), "month", (short) 5);
        setShortField(term42080, term42080.getClass(), "day", (short) 31);
        setField(term42079, term42079.getClass(), "date", term42080);
        setByteField(term42084, term42084.getClass(), "hour", (byte) 16);
        setByteField(term42084, term42084.getClass(), "minute", (byte) 3);
        setByteField(term42084, term42084.getClass(), "second", (byte) 14);
        setIntField(term42084, term42084.getClass(), "nano", 281059649);
        setField(term42079, term42079.getClass(), "time", term42084);
        setField(term42063, term42063.getClass(), "registerTime", term42079);
        setIntField(term42090, term42090.getClass(), "year", 2010);
        setShortField(term42090, term42090.getClass(), "month", (short) 12);
        setShortField(term42090, term42090.getClass(), "day", (short) 30);
        setField(term42089, term42089.getClass(), "date", term42090);
        setByteField(term42094, term42094.getClass(), "hour", (byte) 17);
        setByteField(term42094, term42094.getClass(), "minute", (byte) 44);
        setByteField(term42094, term42094.getClass(), "second", (byte) 59);
        setIntField(term42094, term42094.getClass(), "nano", 881407895);
        setField(term42089, term42089.getClass(), "time", term42094);
        setField(term42063, term42063.getClass(), "accessTime", term42089);
        setField(term42061, term42061.getClass(), "card", term42063);
        setField(term42061, term42061.getClass(), "userName", "lokyclbLEz");
        setIntField(term42061, term42061.getClass(), "isNetMember", -1198145043);
        setIntField(term42061, term42061.getClass(), "iconId", -999740641);
        setIntField(term42061, term42061.getClass(), "plateId", -639247037);
        setIntField(term42061, term42061.getClass(), "titleId", -110418958);
        setIntField(term42061, term42061.getClass(), "partnerId", 1131695499);
        setIntField(term42061, term42061.getClass(), "frameId", -699693103);
        setIntField(term42061, term42061.getClass(), "selectMapId", -365179239);
        setIntField(term42061, term42061.getClass(), "totalAwake", -1670737346);
        setIntField(term42061, term42061.getClass(), "gradeRating", -1150935030);
        setIntField(term42061, term42061.getClass(), "musicRating", 78607598);
        setIntField(term42061, term42061.getClass(), "playerRating", -126292072);
        setIntField(term42061, term42061.getClass(), "highestRating", -1541809993);
        setIntField(term42061, term42061.getClass(), "gradeRank", -1100665028);
        setIntField(term42061, term42061.getClass(), "classRank", -1572533124);
        setIntField(term42061, term42061.getClass(), "courseRank", 1577766413);
        setField(term42061, term42061.getClass(), "charaSlot", term42126);
        setField(term42061, term42061.getClass(), "charaLockSlot", term42138);
        setLongField(term42061, term42061.getClass(), "contentBit", -1348078265481224468L);
        setIntField(term42061, term42061.getClass(), "playCount", -1615367460);
        setField(term42061, term42061.getClass(), "eventWatchedDate", "hAPmQGaxkI");
        setField(term42061, term42061.getClass(), "lastGameId", "ojrnLnJZjT");
        setField(term42061, term42061.getClass(), "lastRomVersion", "rtvXSMjOdJ");
        setField(term42061, term42061.getClass(), "lastDataVersion", "EDkfjuDpNv");
        setField(term42061, term42061.getClass(), "lastLoginDate", "LNHkTUfuHX");
        setField(term42061, term42061.getClass(), "lastPlayDate", "SVWcOAHiTp");
        setIntField(term42061, term42061.getClass(), "lastPlayCredit", 1119103227);
        setIntField(term42061, term42061.getClass(), "lastPlayMode", 1061904558);
        setIntField(term42061, term42061.getClass(), "lastPlaceId", -390418218);
        setField(term42061, term42061.getClass(), "lastPlaceName", "oShLCaneoQ");
        setIntField(term42061, term42061.getClass(), "lastAllNetId", 72302997);
        setIntField(term42061, term42061.getClass(), "lastRegionId", 1619477832);
        setField(term42061, term42061.getClass(), "lastRegionName", "nwKkzNpzyC");
        setField(term42061, term42061.getClass(), "lastClientId", "CwrsdYnHpH");
        setField(term42061, term42061.getClass(), "lastCountryCode", "jifjXNXluS");
        setIntField(term42061, term42061.getClass(), "lastSelectEMoney", 611208497);
        setIntField(term42061, term42061.getClass(), "lastSelectTicket", 1184968868);
        setIntField(term42061, term42061.getClass(), "lastSelectCourse", -882725204);
        setIntField(term42061, term42061.getClass(), "lastCountCourse", 912627382);
        setField(term42061, term42061.getClass(), "firstGameId", "uDayZDXPOP");
        setField(term42061, term42061.getClass(), "firstRomVersion", "kbjWxMAIhY");
        setField(term42061, term42061.getClass(), "firstDataVersion", "GmtlSgqKcI");
        setField(term42061, term42061.getClass(), "firstPlayDate", "ssSbvPoMjB");
        setField(term42061, term42061.getClass(), "compatibleCmVersion", "mhRVADhaKm");
        setField(term42061, term42061.getClass(), "dailyBonusDate", "rLldJrTAay");
        setField(term42061, term42061.getClass(), "dailyCourseBonusDate", "HvSKssbEES");
        setField(term42061, term42061.getClass(), "lastPairLoginDate", "UjIAQAHhul");
        setField(term42061, term42061.getClass(), "lastTrialPlayDate", "oWBXOvjPUT");
        setIntField(term42061, term42061.getClass(), "playVsCount", -761296444);
        setIntField(term42061, term42061.getClass(), "playSyncCount", -189523711);
        setIntField(term42061, term42061.getClass(), "winCount", 1697321852);
        setIntField(term42061, term42061.getClass(), "helpCount", 2107931912);
        setIntField(term42061, term42061.getClass(), "comboCount", 198562318);
        setLongField(term42061, term42061.getClass(), "totalDeluxscore", 7007517375697316368L);
        setLongField(term42061, term42061.getClass(), "totalBasicDeluxscore", 8485924987529500210L);
        setLongField(term42061, term42061.getClass(), "totalAdvancedDeluxscore", 1397546230296552361L);
        setLongField(term42061, term42061.getClass(), "totalExpertDeluxscore", 4531694455151993856L);
        setLongField(term42061, term42061.getClass(), "totalMasterDeluxscore", 4543928187003669961L);
        setLongField(term42061, term42061.getClass(), "totalReMasterDeluxscore", -1536013261126093321L);
        setIntField(term42061, term42061.getClass(), "totalSync", 1164105108);
        setIntField(term42061, term42061.getClass(), "totalBasicSync", -972073241);
        setIntField(term42061, term42061.getClass(), "totalAdvancedSync", 643112473);
        setIntField(term42061, term42061.getClass(), "totalExpertSync", -1141492053);
        setIntField(term42061, term42061.getClass(), "totalMasterSync", 1094053796);
        setIntField(term42061, term42061.getClass(), "totalReMasterSync", -2097088884);
        setLongField(term42061, term42061.getClass(), "totalAchievement", 5953375436340093396L);
        setLongField(term42061, term42061.getClass(), "totalBasicAchievement", -7089384741512135431L);
        setLongField(term42061, term42061.getClass(), "totalAdvancedAchievement", 7207062884131909895L);
        setLongField(term42061, term42061.getClass(), "totalExpertAchievement", 9005525882295990505L);
        setLongField(term42061, term42061.getClass(), "totalMasterAchievement", -604910205679247392L);
        setLongField(term42061, term42061.getClass(), "totalReMasterAchievement", 2280240558714436788L);
        setLongField(term42061, term42061.getClass(), "playerOldRating", 9164041864010757052L);
        setLongField(term42061, term42061.getClass(), "playerNewRating", -4710087184100544875L);
        setIntField(term42061, term42061.getClass(), "banState", -1793718020);
        setLongField(term42061, term42061.getClass(), "dateTime", 8351267378333718210L);
        setField(term42059, term42059.getClass(), "user", term42061);
        setIntField(term42059, term42059.getClass(), "itemKind", 1087957895);
        setIntField(term42059, term42059.getClass(), "itemId", -1347788838);
        setIntField(term42059, term42059.getClass(), "stock", -83628231);
        setBooleanField(term42059, term42059.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term42059, args);
    }

};


