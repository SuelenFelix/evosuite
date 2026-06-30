package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserBoss_getEmblemFlagList_18736352010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91687;

    public UserBoss_getEmblemFlagList_18736352010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91693 = new Long(1346299551708610248L);
        term91687 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term91689 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term91691 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91712 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91722 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91687, term91687.getClass(), "id", -8195504192950938590L);
        setLongField(term91689, term91689.getClass(), "id", -3141593811423226559L);
        setLongField(term91691, term91691.getClass(), "id", 165312735504471081L);
        setField(term91691, term91691.getClass(), "extId", term91693);
        setField(term91691, term91691.getClass(), "luid", "PhtNZAacut");
        setIntField(term91708, term91708.getClass(), "year", 2017);
        setShortField(term91708, term91708.getClass(), "month", (short) 9);
        setShortField(term91708, term91708.getClass(), "day", (short) 20);
        setField(term91707, term91707.getClass(), "date", term91708);
        setByteField(term91712, term91712.getClass(), "hour", (byte) 7);
        setByteField(term91712, term91712.getClass(), "minute", (byte) 35);
        setByteField(term91712, term91712.getClass(), "second", (byte) 31);
        setIntField(term91712, term91712.getClass(), "nano", 62099803);
        setField(term91707, term91707.getClass(), "time", term91712);
        setField(term91691, term91691.getClass(), "registerTime", term91707);
        setIntField(term91718, term91718.getClass(), "year", 2025);
        setShortField(term91718, term91718.getClass(), "month", (short) 1);
        setShortField(term91718, term91718.getClass(), "day", (short) 8);
        setField(term91717, term91717.getClass(), "date", term91718);
        setByteField(term91722, term91722.getClass(), "hour", (byte) 19);
        setByteField(term91722, term91722.getClass(), "minute", (byte) 44);
        setByteField(term91722, term91722.getClass(), "second", (byte) 29);
        setIntField(term91722, term91722.getClass(), "nano", 541948713);
        setField(term91717, term91717.getClass(), "time", term91722);
        setField(term91691, term91691.getClass(), "accessTime", term91717);
        setField(term91689, term91689.getClass(), "card", term91691);
        setIntField(term91689, term91689.getClass(), "lastDataVersion", 1084226733);
        setField(term91689, term91689.getClass(), "userName", "xbPAqsSBBS");
        setIntField(term91689, term91689.getClass(), "point", 853211145);
        setIntField(term91689, term91689.getClass(), "totalPoint", 281265026);
        setIntField(term91689, term91689.getClass(), "iconId", -10577848);
        setIntField(term91689, term91689.getClass(), "nameplateId", 1914024362);
        setIntField(term91689, term91689.getClass(), "frameId", 498177640);
        setIntField(term91689, term91689.getClass(), "trophyId", 987790925);
        setIntField(term91689, term91689.getClass(), "playCount", 1502837369);
        setIntField(term91689, term91689.getClass(), "playVsCount", 980943695);
        setIntField(term91689, term91689.getClass(), "playSyncCount", 1100165285);
        setIntField(term91689, term91689.getClass(), "winCount", -686406135);
        setIntField(term91689, term91689.getClass(), "helpCount", -287429580);
        setIntField(term91689, term91689.getClass(), "comboCount", -1517877256);
        setIntField(term91689, term91689.getClass(), "feverCount", 1926230705);
        setIntField(term91689, term91689.getClass(), "totalHiScore", 230249356);
        setIntField(term91689, term91689.getClass(), "totalEasyHighScore", 81634969);
        setIntField(term91689, term91689.getClass(), "totalBasicHighScore", -564270021);
        setIntField(term91689, term91689.getClass(), "totalAdvancedHighScore", -711410886);
        setIntField(term91689, term91689.getClass(), "totalExpertHighScore", 1905282682);
        setIntField(term91689, term91689.getClass(), "totalMasterHighScore", 1714255787);
        setIntField(term91689, term91689.getClass(), "totalReMasterHighScore", 257119068);
        setIntField(term91689, term91689.getClass(), "totalHighSync", 1243637000);
        setIntField(term91689, term91689.getClass(), "totalEasySync", 1377854679);
        setIntField(term91689, term91689.getClass(), "totalBasicSync", -563428268);
        setIntField(term91689, term91689.getClass(), "totalAdvancedSync", 60476165);
        setIntField(term91689, term91689.getClass(), "totalExpertSync", 238928554);
        setIntField(term91689, term91689.getClass(), "totalMasterSync", 1223346141);
        setIntField(term91689, term91689.getClass(), "totalReMasterSync", -2030508372);
        setIntField(term91689, term91689.getClass(), "playerRating", 1541228086);
        setIntField(term91689, term91689.getClass(), "highestRating", 297742417);
        setIntField(term91689, term91689.getClass(), "rankAuthTailId", 1816437264);
        setField(term91689, term91689.getClass(), "eventWatchedDate", "ivxMfASKCB");
        setField(term91689, term91689.getClass(), "webLimitDate", "JbksMMXXzT");
        setIntField(term91689, term91689.getClass(), "challengeTrackPhase", -1501877126);
        setIntField(term91689, term91689.getClass(), "firstPlayBits", 803853178);
        setField(term91689, term91689.getClass(), "lastPlayDate", "WHpoLWpffz");
        setIntField(term91689, term91689.getClass(), "lastPlaceId", -1572151301);
        setField(term91689, term91689.getClass(), "lastPlaceName", "axiXBkomuw");
        setIntField(term91689, term91689.getClass(), "lastRegionId", 1802492559);
        setField(term91689, term91689.getClass(), "lastRegionName", "nhByIXwUpO");
        setField(term91689, term91689.getClass(), "lastClientId", "vVySvQZVok");
        setField(term91689, term91689.getClass(), "lastCountryCode", "fDVzkGiHev");
        setIntField(term91689, term91689.getClass(), "eventPoint", -800228870);
        setIntField(term91689, term91689.getClass(), "totalLv", -604044709);
        setIntField(term91689, term91689.getClass(), "lastLoginBonusDay", -474659885);
        setIntField(term91689, term91689.getClass(), "lastSurvivalBonusDay", 992754091);
        setIntField(term91689, term91689.getClass(), "loginBonusLv", -711076640);
        setField(term91687, term91687.getClass(), "user", term91689);
        setLongField(term91687, term91687.getClass(), "pandoraFlagList0", 7910323873668469704L);
        setLongField(term91687, term91687.getClass(), "pandoraFlagList1", -8034026767184380879L);
        setLongField(term91687, term91687.getClass(), "pandoraFlagList2", -1865079020076651952L);
        setLongField(term91687, term91687.getClass(), "pandoraFlagList3", -6255610460583667093L);
        setLongField(term91687, term91687.getClass(), "pandoraFlagList4", -3947173237186855838L);
        setLongField(term91687, term91687.getClass(), "pandoraFlagList5", 1186857065042697930L);
        setLongField(term91687, term91687.getClass(), "pandoraFlagList6", 1659080369100392023L);
        setLongField(term91687, term91687.getClass(), "emblemFlagList", 854087753192360238L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmblemFlagList", argTypes, term91687, args);
    }

};


