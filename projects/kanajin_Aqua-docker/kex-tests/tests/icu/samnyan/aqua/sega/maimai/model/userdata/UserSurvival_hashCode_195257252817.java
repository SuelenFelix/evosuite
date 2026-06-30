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

public class UserSurvival_hashCode_195257252817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106767;

    public UserSurvival_hashCode_195257252817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term106773 = new Long(-3279534582096707294L);
        term106767 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term106769 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term106771 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term106787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106792 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106802 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term106767, term106767.getClass(), "id", -2336486223565755398L);
        setLongField(term106769, term106769.getClass(), "id", -5604785092434648765L);
        setLongField(term106771, term106771.getClass(), "id", 753843644992595899L);
        setField(term106771, term106771.getClass(), "extId", term106773);
        setField(term106771, term106771.getClass(), "luid", "PCttFvFDzJ");
        setIntField(term106788, term106788.getClass(), "year", 2027);
        setShortField(term106788, term106788.getClass(), "month", (short) 10);
        setShortField(term106788, term106788.getClass(), "day", (short) 4);
        setField(term106787, term106787.getClass(), "date", term106788);
        setByteField(term106792, term106792.getClass(), "hour", (byte) 18);
        setByteField(term106792, term106792.getClass(), "minute", (byte) 14);
        setByteField(term106792, term106792.getClass(), "second", (byte) 14);
        setIntField(term106792, term106792.getClass(), "nano", 221363683);
        setField(term106787, term106787.getClass(), "time", term106792);
        setField(term106771, term106771.getClass(), "registerTime", term106787);
        setIntField(term106798, term106798.getClass(), "year", 2014);
        setShortField(term106798, term106798.getClass(), "month", (short) 9);
        setShortField(term106798, term106798.getClass(), "day", (short) 21);
        setField(term106797, term106797.getClass(), "date", term106798);
        setByteField(term106802, term106802.getClass(), "hour", (byte) 13);
        setByteField(term106802, term106802.getClass(), "minute", (byte) 30);
        setByteField(term106802, term106802.getClass(), "second", (byte) 57);
        setIntField(term106802, term106802.getClass(), "nano", 749136236);
        setField(term106797, term106797.getClass(), "time", term106802);
        setField(term106771, term106771.getClass(), "accessTime", term106797);
        setField(term106769, term106769.getClass(), "card", term106771);
        setIntField(term106769, term106769.getClass(), "lastDataVersion", -1144078722);
        setField(term106769, term106769.getClass(), "userName", "fwAMmjMsDq");
        setIntField(term106769, term106769.getClass(), "point", 985328761);
        setIntField(term106769, term106769.getClass(), "totalPoint", 1763151581);
        setIntField(term106769, term106769.getClass(), "iconId", -16270144);
        setIntField(term106769, term106769.getClass(), "nameplateId", -1976813344);
        setIntField(term106769, term106769.getClass(), "frameId", -534356677);
        setIntField(term106769, term106769.getClass(), "trophyId", 59076012);
        setIntField(term106769, term106769.getClass(), "playCount", -1884319919);
        setIntField(term106769, term106769.getClass(), "playVsCount", 1478112495);
        setIntField(term106769, term106769.getClass(), "playSyncCount", -1985949720);
        setIntField(term106769, term106769.getClass(), "winCount", -1847204793);
        setIntField(term106769, term106769.getClass(), "helpCount", 1070535972);
        setIntField(term106769, term106769.getClass(), "comboCount", -392119850);
        setIntField(term106769, term106769.getClass(), "feverCount", -1219765617);
        setIntField(term106769, term106769.getClass(), "totalHiScore", 1761410215);
        setIntField(term106769, term106769.getClass(), "totalEasyHighScore", 152890697);
        setIntField(term106769, term106769.getClass(), "totalBasicHighScore", 567880137);
        setIntField(term106769, term106769.getClass(), "totalAdvancedHighScore", 1044699382);
        setIntField(term106769, term106769.getClass(), "totalExpertHighScore", -1361865906);
        setIntField(term106769, term106769.getClass(), "totalMasterHighScore", -1811613830);
        setIntField(term106769, term106769.getClass(), "totalReMasterHighScore", -962036081);
        setIntField(term106769, term106769.getClass(), "totalHighSync", -251705138);
        setIntField(term106769, term106769.getClass(), "totalEasySync", 1341608295);
        setIntField(term106769, term106769.getClass(), "totalBasicSync", -271438483);
        setIntField(term106769, term106769.getClass(), "totalAdvancedSync", -1421718976);
        setIntField(term106769, term106769.getClass(), "totalExpertSync", 1517040936);
        setIntField(term106769, term106769.getClass(), "totalMasterSync", -1061313238);
        setIntField(term106769, term106769.getClass(), "totalReMasterSync", -1148437143);
        setIntField(term106769, term106769.getClass(), "playerRating", 215253072);
        setIntField(term106769, term106769.getClass(), "highestRating", 812148008);
        setIntField(term106769, term106769.getClass(), "rankAuthTailId", -636265339);
        setField(term106769, term106769.getClass(), "eventWatchedDate", "aqdKzesECj");
        setField(term106769, term106769.getClass(), "webLimitDate", "voSygcVEYO");
        setIntField(term106769, term106769.getClass(), "challengeTrackPhase", 1987820060);
        setIntField(term106769, term106769.getClass(), "firstPlayBits", -1942467893);
        setField(term106769, term106769.getClass(), "lastPlayDate", "LfcceVKtWg");
        setIntField(term106769, term106769.getClass(), "lastPlaceId", -2091761161);
        setField(term106769, term106769.getClass(), "lastPlaceName", "CNkueZBdYF");
        setIntField(term106769, term106769.getClass(), "lastRegionId", 1574487544);
        setField(term106769, term106769.getClass(), "lastRegionName", "ZAjjJEUomV");
        setField(term106769, term106769.getClass(), "lastClientId", "cHwZbezfEu");
        setField(term106769, term106769.getClass(), "lastCountryCode", "GuQzOBxsNv");
        setIntField(term106769, term106769.getClass(), "eventPoint", -1423903830);
        setIntField(term106769, term106769.getClass(), "totalLv", -1232834591);
        setIntField(term106769, term106769.getClass(), "lastLoginBonusDay", 2034477054);
        setIntField(term106769, term106769.getClass(), "lastSurvivalBonusDay", -1805354048);
        setIntField(term106769, term106769.getClass(), "loginBonusLv", -6894071);
        setField(term106767, term106767.getClass(), "user", term106769);
        setIntField(term106767, term106767.getClass(), "survivalId", 958532517);
        setIntField(term106767, term106767.getClass(), "totalScore", 1383798608);
        setIntField(term106767, term106767.getClass(), "totalAchieve", -238731977);
        setBooleanField(term106767, term106767.getClass(), "isClear", true);
        setBooleanField(term106767, term106767.getClass(), "isNoDamage", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term106767, args);
    }

};


