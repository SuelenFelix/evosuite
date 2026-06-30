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

public class UserItem_setItemKind_18445917179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38645;
     Object term39008;

    public UserItem_setItemKind_18445917179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38651 = new Long(-3838084482494604218L);
        Integer term38714 = new Integer(-695279311);
        Integer term38716 = new Integer(114279242);
        ArrayList term38712 = new ArrayList();
        ((ArrayList) term38712).add(term38714);
        ((ArrayList) term38712).add(term38716);
        Integer term38722 = new Integer(990883365);
        Integer term38724 = new Integer(633598642);
        Integer term38726 = new Integer(1862841859);
        Integer term38728 = new Integer(-1114668574);
        Integer term38730 = new Integer(514511037);
        Integer term38732 = new Integer(1713573821);
        Integer term38734 = new Integer(1956590498);
        ArrayList term38720 = new ArrayList();
        ((ArrayList) term38720).add(term38722);
        ((ArrayList) term38720).add(term38724);
        ((ArrayList) term38720).add(term38726);
        ((ArrayList) term38720).add(term38728);
        ((ArrayList) term38720).add(term38730);
        ((ArrayList) term38720).add(term38732);
        ((ArrayList) term38720).add(term38734);
        term38645 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term38647 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term38649 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term38665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38670 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38680 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term38645, term38645.getClass(), "id", 7534205281044116098L);
        setLongField(term38647, term38647.getClass(), "id", -4078647199307459633L);
        setLongField(term38649, term38649.getClass(), "id", -2505751043723962819L);
        setField(term38649, term38649.getClass(), "extId", term38651);
        setField(term38649, term38649.getClass(), "luid", "pADwkrWiMW");
        setIntField(term38666, term38666.getClass(), "year", 2022);
        setShortField(term38666, term38666.getClass(), "month", (short) 11);
        setShortField(term38666, term38666.getClass(), "day", (short) 5);
        setField(term38665, term38665.getClass(), "date", term38666);
        setByteField(term38670, term38670.getClass(), "hour", (byte) 0);
        setByteField(term38670, term38670.getClass(), "minute", (byte) 51);
        setByteField(term38670, term38670.getClass(), "second", (byte) 23);
        setIntField(term38670, term38670.getClass(), "nano", 1140962);
        setField(term38665, term38665.getClass(), "time", term38670);
        setField(term38649, term38649.getClass(), "registerTime", term38665);
        setIntField(term38676, term38676.getClass(), "year", 2020);
        setShortField(term38676, term38676.getClass(), "month", (short) 5);
        setShortField(term38676, term38676.getClass(), "day", (short) 24);
        setField(term38675, term38675.getClass(), "date", term38676);
        setByteField(term38680, term38680.getClass(), "hour", (byte) 2);
        setByteField(term38680, term38680.getClass(), "minute", (byte) 9);
        setByteField(term38680, term38680.getClass(), "second", (byte) 52);
        setIntField(term38680, term38680.getClass(), "nano", 653329393);
        setField(term38675, term38675.getClass(), "time", term38680);
        setField(term38649, term38649.getClass(), "accessTime", term38675);
        setField(term38647, term38647.getClass(), "card", term38649);
        setField(term38647, term38647.getClass(), "userName", "FDORDJuAXQ");
        setIntField(term38647, term38647.getClass(), "isNetMember", -322159635);
        setIntField(term38647, term38647.getClass(), "iconId", 366996139);
        setIntField(term38647, term38647.getClass(), "plateId", 806187937);
        setIntField(term38647, term38647.getClass(), "titleId", -1646415676);
        setIntField(term38647, term38647.getClass(), "partnerId", 1016563502);
        setIntField(term38647, term38647.getClass(), "frameId", -1845173237);
        setIntField(term38647, term38647.getClass(), "selectMapId", -326684811);
        setIntField(term38647, term38647.getClass(), "totalAwake", 1260583823);
        setIntField(term38647, term38647.getClass(), "gradeRating", -1368801661);
        setIntField(term38647, term38647.getClass(), "musicRating", -2094311816);
        setIntField(term38647, term38647.getClass(), "playerRating", 419332770);
        setIntField(term38647, term38647.getClass(), "highestRating", 1742733401);
        setIntField(term38647, term38647.getClass(), "gradeRank", 1634939612);
        setIntField(term38647, term38647.getClass(), "classRank", -590256406);
        setIntField(term38647, term38647.getClass(), "courseRank", -1319797966);
        setField(term38647, term38647.getClass(), "charaSlot", term38712);
        setField(term38647, term38647.getClass(), "charaLockSlot", term38720);
        setLongField(term38647, term38647.getClass(), "contentBit", 8156554915757243776L);
        setIntField(term38647, term38647.getClass(), "playCount", -388682282);
        setField(term38647, term38647.getClass(), "eventWatchedDate", "yjqoDeLBLg");
        setField(term38647, term38647.getClass(), "lastGameId", "DCepDqVwas");
        setField(term38647, term38647.getClass(), "lastRomVersion", "wKIBUlfNCx");
        setField(term38647, term38647.getClass(), "lastDataVersion", "iGfMUWRvod");
        setField(term38647, term38647.getClass(), "lastLoginDate", "zUXaSvayQe");
        setField(term38647, term38647.getClass(), "lastPlayDate", "bPVcnnQPSC");
        setIntField(term38647, term38647.getClass(), "lastPlayCredit", 2028706829);
        setIntField(term38647, term38647.getClass(), "lastPlayMode", -656080518);
        setIntField(term38647, term38647.getClass(), "lastPlaceId", 1769230265);
        setField(term38647, term38647.getClass(), "lastPlaceName", "PQLyoEKWSa");
        setIntField(term38647, term38647.getClass(), "lastAllNetId", -1946503216);
        setIntField(term38647, term38647.getClass(), "lastRegionId", 467573222);
        setField(term38647, term38647.getClass(), "lastRegionName", "HOgkhttJZS");
        setField(term38647, term38647.getClass(), "lastClientId", "goqNSmXSSS");
        setField(term38647, term38647.getClass(), "lastCountryCode", "AkViBLdqXM");
        setIntField(term38647, term38647.getClass(), "lastSelectEMoney", -197212451);
        setIntField(term38647, term38647.getClass(), "lastSelectTicket", 213194885);
        setIntField(term38647, term38647.getClass(), "lastSelectCourse", 364063308);
        setIntField(term38647, term38647.getClass(), "lastCountCourse", -787041664);
        setField(term38647, term38647.getClass(), "firstGameId", "UlxGFzEifL");
        setField(term38647, term38647.getClass(), "firstRomVersion", "HilHTbDKDF");
        setField(term38647, term38647.getClass(), "firstDataVersion", "IaEqlVwmNS");
        setField(term38647, term38647.getClass(), "firstPlayDate", "ljNOgdPWrL");
        setField(term38647, term38647.getClass(), "compatibleCmVersion", "oBlIZiyRMS");
        setField(term38647, term38647.getClass(), "dailyBonusDate", "QUYAkhtCNh");
        setField(term38647, term38647.getClass(), "dailyCourseBonusDate", "kOaAQOLyqd");
        setField(term38647, term38647.getClass(), "lastPairLoginDate", "ICBWiKaeHC");
        setField(term38647, term38647.getClass(), "lastTrialPlayDate", "WAljagiCzu");
        setIntField(term38647, term38647.getClass(), "playVsCount", 2141179437);
        setIntField(term38647, term38647.getClass(), "playSyncCount", -826972140);
        setIntField(term38647, term38647.getClass(), "winCount", 737250028);
        setIntField(term38647, term38647.getClass(), "helpCount", -1870044711);
        setIntField(term38647, term38647.getClass(), "comboCount", -719110417);
        setLongField(term38647, term38647.getClass(), "totalDeluxscore", -351840430901591519L);
        setLongField(term38647, term38647.getClass(), "totalBasicDeluxscore", 3900637824492447206L);
        setLongField(term38647, term38647.getClass(), "totalAdvancedDeluxscore", 5914809586547397675L);
        setLongField(term38647, term38647.getClass(), "totalExpertDeluxscore", -8946539398468447729L);
        setLongField(term38647, term38647.getClass(), "totalMasterDeluxscore", -5919044245258983254L);
        setLongField(term38647, term38647.getClass(), "totalReMasterDeluxscore", 8229243567352210338L);
        setIntField(term38647, term38647.getClass(), "totalSync", -1866172730);
        setIntField(term38647, term38647.getClass(), "totalBasicSync", 1129688211);
        setIntField(term38647, term38647.getClass(), "totalAdvancedSync", 2126253731);
        setIntField(term38647, term38647.getClass(), "totalExpertSync", 1637943121);
        setIntField(term38647, term38647.getClass(), "totalMasterSync", -1889806893);
        setIntField(term38647, term38647.getClass(), "totalReMasterSync", 2101844302);
        setLongField(term38647, term38647.getClass(), "totalAchievement", 1651638210050263261L);
        setLongField(term38647, term38647.getClass(), "totalBasicAchievement", -9187816361133186528L);
        setLongField(term38647, term38647.getClass(), "totalAdvancedAchievement", 7069791900685590489L);
        setLongField(term38647, term38647.getClass(), "totalExpertAchievement", -5849408670992771988L);
        setLongField(term38647, term38647.getClass(), "totalMasterAchievement", 3210450133277104L);
        setLongField(term38647, term38647.getClass(), "totalReMasterAchievement", 6637550433135455885L);
        setLongField(term38647, term38647.getClass(), "playerOldRating", -5562622835440119601L);
        setLongField(term38647, term38647.getClass(), "playerNewRating", 493485007607912369L);
        setIntField(term38647, term38647.getClass(), "banState", 1975711832);
        setLongField(term38647, term38647.getClass(), "dateTime", -8980424779299328600L);
        setField(term38645, term38645.getClass(), "user", term38647);
        setIntField(term38645, term38645.getClass(), "itemKind", -712035661);
        setIntField(term38645, term38645.getClass(), "itemId", -545530498);
        setIntField(term38645, term38645.getClass(), "stock", -1018874255);
        setBooleanField(term38645, term38645.getClass(), "isValid", true);
        term39008 = new Integer(-268930414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term39008;
        callMethod(klass, "setItemKind", argTypes, term38645, args);
    }

};


