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

public class UserBoss_getPandoraFlagList5_168809448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91139;

    public UserBoss_getPandoraFlagList5_168809448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91145 = new Long(11315815278355083L);
        term91139 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term91141 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term91143 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91164 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91174 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91139, term91139.getClass(), "id", -6096027338784768449L);
        setLongField(term91141, term91141.getClass(), "id", 6338971839666144092L);
        setLongField(term91143, term91143.getClass(), "id", 5295517562699482299L);
        setField(term91143, term91143.getClass(), "extId", term91145);
        setField(term91143, term91143.getClass(), "luid", "lpFCMaAYxj");
        setIntField(term91160, term91160.getClass(), "year", 2018);
        setShortField(term91160, term91160.getClass(), "month", (short) 10);
        setShortField(term91160, term91160.getClass(), "day", (short) 31);
        setField(term91159, term91159.getClass(), "date", term91160);
        setByteField(term91164, term91164.getClass(), "hour", (byte) 9);
        setByteField(term91164, term91164.getClass(), "minute", (byte) 43);
        setByteField(term91164, term91164.getClass(), "second", (byte) 37);
        setIntField(term91164, term91164.getClass(), "nano", 207857677);
        setField(term91159, term91159.getClass(), "time", term91164);
        setField(term91143, term91143.getClass(), "registerTime", term91159);
        setIntField(term91170, term91170.getClass(), "year", 2026);
        setShortField(term91170, term91170.getClass(), "month", (short) 6);
        setShortField(term91170, term91170.getClass(), "day", (short) 21);
        setField(term91169, term91169.getClass(), "date", term91170);
        setByteField(term91174, term91174.getClass(), "hour", (byte) 16);
        setByteField(term91174, term91174.getClass(), "minute", (byte) 57);
        setByteField(term91174, term91174.getClass(), "second", (byte) 9);
        setIntField(term91174, term91174.getClass(), "nano", 14807006);
        setField(term91169, term91169.getClass(), "time", term91174);
        setField(term91143, term91143.getClass(), "accessTime", term91169);
        setField(term91141, term91141.getClass(), "card", term91143);
        setIntField(term91141, term91141.getClass(), "lastDataVersion", 1705432758);
        setField(term91141, term91141.getClass(), "userName", "fzHVMNSLii");
        setIntField(term91141, term91141.getClass(), "point", 1869760927);
        setIntField(term91141, term91141.getClass(), "totalPoint", 1737709990);
        setIntField(term91141, term91141.getClass(), "iconId", -1596985572);
        setIntField(term91141, term91141.getClass(), "nameplateId", -1547597017);
        setIntField(term91141, term91141.getClass(), "frameId", -1899999573);
        setIntField(term91141, term91141.getClass(), "trophyId", 50986188);
        setIntField(term91141, term91141.getClass(), "playCount", -1798385983);
        setIntField(term91141, term91141.getClass(), "playVsCount", -1751426385);
        setIntField(term91141, term91141.getClass(), "playSyncCount", -2043903065);
        setIntField(term91141, term91141.getClass(), "winCount", -1301683464);
        setIntField(term91141, term91141.getClass(), "helpCount", 1838060666);
        setIntField(term91141, term91141.getClass(), "comboCount", -1354834639);
        setIntField(term91141, term91141.getClass(), "feverCount", 1855161601);
        setIntField(term91141, term91141.getClass(), "totalHiScore", 1447406432);
        setIntField(term91141, term91141.getClass(), "totalEasyHighScore", -1261622822);
        setIntField(term91141, term91141.getClass(), "totalBasicHighScore", 1191113274);
        setIntField(term91141, term91141.getClass(), "totalAdvancedHighScore", -1722069360);
        setIntField(term91141, term91141.getClass(), "totalExpertHighScore", -1495659787);
        setIntField(term91141, term91141.getClass(), "totalMasterHighScore", -13450873);
        setIntField(term91141, term91141.getClass(), "totalReMasterHighScore", 214091895);
        setIntField(term91141, term91141.getClass(), "totalHighSync", -1653301256);
        setIntField(term91141, term91141.getClass(), "totalEasySync", 1107780347);
        setIntField(term91141, term91141.getClass(), "totalBasicSync", 1162865727);
        setIntField(term91141, term91141.getClass(), "totalAdvancedSync", 46557287);
        setIntField(term91141, term91141.getClass(), "totalExpertSync", 1977860945);
        setIntField(term91141, term91141.getClass(), "totalMasterSync", -449467173);
        setIntField(term91141, term91141.getClass(), "totalReMasterSync", -1896252900);
        setIntField(term91141, term91141.getClass(), "playerRating", -1530087856);
        setIntField(term91141, term91141.getClass(), "highestRating", -1430480374);
        setIntField(term91141, term91141.getClass(), "rankAuthTailId", -294990025);
        setField(term91141, term91141.getClass(), "eventWatchedDate", "TxymnVINZF");
        setField(term91141, term91141.getClass(), "webLimitDate", "fkBfmixBEh");
        setIntField(term91141, term91141.getClass(), "challengeTrackPhase", -1062556648);
        setIntField(term91141, term91141.getClass(), "firstPlayBits", -1323622538);
        setField(term91141, term91141.getClass(), "lastPlayDate", "SWbairdDKL");
        setIntField(term91141, term91141.getClass(), "lastPlaceId", -975694837);
        setField(term91141, term91141.getClass(), "lastPlaceName", "AibUFEALwF");
        setIntField(term91141, term91141.getClass(), "lastRegionId", 600354879);
        setField(term91141, term91141.getClass(), "lastRegionName", "eXOUrXTrdW");
        setField(term91141, term91141.getClass(), "lastClientId", "aomDEETHep");
        setField(term91141, term91141.getClass(), "lastCountryCode", "GTMrlIYfIM");
        setIntField(term91141, term91141.getClass(), "eventPoint", -1910867502);
        setIntField(term91141, term91141.getClass(), "totalLv", -681154934);
        setIntField(term91141, term91141.getClass(), "lastLoginBonusDay", -1605929703);
        setIntField(term91141, term91141.getClass(), "lastSurvivalBonusDay", -299263678);
        setIntField(term91141, term91141.getClass(), "loginBonusLv", 347664273);
        setField(term91139, term91139.getClass(), "user", term91141);
        setLongField(term91139, term91139.getClass(), "pandoraFlagList0", -7671399023433976259L);
        setLongField(term91139, term91139.getClass(), "pandoraFlagList1", -8653467709084853156L);
        setLongField(term91139, term91139.getClass(), "pandoraFlagList2", 6135782592145916721L);
        setLongField(term91139, term91139.getClass(), "pandoraFlagList3", 7930227263182470549L);
        setLongField(term91139, term91139.getClass(), "pandoraFlagList4", -2571841019708046378L);
        setLongField(term91139, term91139.getClass(), "pandoraFlagList5", -4682102699090617454L);
        setLongField(term91139, term91139.getClass(), "pandoraFlagList6", 8018453258973130416L);
        setLongField(term91139, term91139.getClass(), "emblemFlagList", 5592372218942533021L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPandoraFlagList5", argTypes, term91139, args);
    }

};


