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

public class UserBoss_getPandoraFlagList6_168799839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91413;

    public UserBoss_getPandoraFlagList6_168799839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91419 = new Long(7735460540091431012L);
        term91413 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term91415 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term91417 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91433 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91434 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91438 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91443 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91444 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91448 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term91413, term91413.getClass(), "id", 8423938983545919786L);
        setLongField(term91415, term91415.getClass(), "id", -6523933176535405885L);
        setLongField(term91417, term91417.getClass(), "id", 6558561920118298074L);
        setField(term91417, term91417.getClass(), "extId", term91419);
        setField(term91417, term91417.getClass(), "luid", "eiDqCOWbLE");
        setIntField(term91434, term91434.getClass(), "year", 2014);
        setShortField(term91434, term91434.getClass(), "month", (short) 5);
        setShortField(term91434, term91434.getClass(), "day", (short) 26);
        setField(term91433, term91433.getClass(), "date", term91434);
        setByteField(term91438, term91438.getClass(), "hour", (byte) 21);
        setByteField(term91438, term91438.getClass(), "minute", (byte) 54);
        setByteField(term91438, term91438.getClass(), "second", (byte) 33);
        setIntField(term91438, term91438.getClass(), "nano", 182465793);
        setField(term91433, term91433.getClass(), "time", term91438);
        setField(term91417, term91417.getClass(), "registerTime", term91433);
        setIntField(term91444, term91444.getClass(), "year", 2019);
        setShortField(term91444, term91444.getClass(), "month", (short) 4);
        setShortField(term91444, term91444.getClass(), "day", (short) 3);
        setField(term91443, term91443.getClass(), "date", term91444);
        setByteField(term91448, term91448.getClass(), "hour", (byte) 11);
        setByteField(term91448, term91448.getClass(), "minute", (byte) 54);
        setByteField(term91448, term91448.getClass(), "second", (byte) 10);
        setIntField(term91448, term91448.getClass(), "nano", 203720801);
        setField(term91443, term91443.getClass(), "time", term91448);
        setField(term91417, term91417.getClass(), "accessTime", term91443);
        setField(term91415, term91415.getClass(), "card", term91417);
        setIntField(term91415, term91415.getClass(), "lastDataVersion", 1180386145);
        setField(term91415, term91415.getClass(), "userName", "OBbbsrFNxC");
        setIntField(term91415, term91415.getClass(), "point", -1226044289);
        setIntField(term91415, term91415.getClass(), "totalPoint", 803651464);
        setIntField(term91415, term91415.getClass(), "iconId", -1466570615);
        setIntField(term91415, term91415.getClass(), "nameplateId", -471545371);
        setIntField(term91415, term91415.getClass(), "frameId", -505396503);
        setIntField(term91415, term91415.getClass(), "trophyId", 1161692766);
        setIntField(term91415, term91415.getClass(), "playCount", -1367168675);
        setIntField(term91415, term91415.getClass(), "playVsCount", 1207815248);
        setIntField(term91415, term91415.getClass(), "playSyncCount", -574020974);
        setIntField(term91415, term91415.getClass(), "winCount", 1971932785);
        setIntField(term91415, term91415.getClass(), "helpCount", 2069110501);
        setIntField(term91415, term91415.getClass(), "comboCount", 620342422);
        setIntField(term91415, term91415.getClass(), "feverCount", -839533151);
        setIntField(term91415, term91415.getClass(), "totalHiScore", -1395988897);
        setIntField(term91415, term91415.getClass(), "totalEasyHighScore", -1572616912);
        setIntField(term91415, term91415.getClass(), "totalBasicHighScore", 637817122);
        setIntField(term91415, term91415.getClass(), "totalAdvancedHighScore", -1666967856);
        setIntField(term91415, term91415.getClass(), "totalExpertHighScore", 288878731);
        setIntField(term91415, term91415.getClass(), "totalMasterHighScore", -1345750324);
        setIntField(term91415, term91415.getClass(), "totalReMasterHighScore", -329240379);
        setIntField(term91415, term91415.getClass(), "totalHighSync", 706310223);
        setIntField(term91415, term91415.getClass(), "totalEasySync", 1503842864);
        setIntField(term91415, term91415.getClass(), "totalBasicSync", 1395180612);
        setIntField(term91415, term91415.getClass(), "totalAdvancedSync", 1625598443);
        setIntField(term91415, term91415.getClass(), "totalExpertSync", -38394649);
        setIntField(term91415, term91415.getClass(), "totalMasterSync", 1832189880);
        setIntField(term91415, term91415.getClass(), "totalReMasterSync", -2087697431);
        setIntField(term91415, term91415.getClass(), "playerRating", 682498319);
        setIntField(term91415, term91415.getClass(), "highestRating", 1946906465);
        setIntField(term91415, term91415.getClass(), "rankAuthTailId", 470334030);
        setField(term91415, term91415.getClass(), "eventWatchedDate", "mvdZyohjrq");
        setField(term91415, term91415.getClass(), "webLimitDate", "hXsByefZqZ");
        setIntField(term91415, term91415.getClass(), "challengeTrackPhase", 1448241621);
        setIntField(term91415, term91415.getClass(), "firstPlayBits", -2062261648);
        setField(term91415, term91415.getClass(), "lastPlayDate", "PfWKdFFgbz");
        setIntField(term91415, term91415.getClass(), "lastPlaceId", -1535392729);
        setField(term91415, term91415.getClass(), "lastPlaceName", "rgmFLfFmTW");
        setIntField(term91415, term91415.getClass(), "lastRegionId", -802647375);
        setField(term91415, term91415.getClass(), "lastRegionName", "GHvFvelXFv");
        setField(term91415, term91415.getClass(), "lastClientId", "MIDoqNmCoh");
        setField(term91415, term91415.getClass(), "lastCountryCode", "yrOIMfdQSI");
        setIntField(term91415, term91415.getClass(), "eventPoint", 1588240428);
        setIntField(term91415, term91415.getClass(), "totalLv", 118743812);
        setIntField(term91415, term91415.getClass(), "lastLoginBonusDay", -967532244);
        setIntField(term91415, term91415.getClass(), "lastSurvivalBonusDay", 679724363);
        setIntField(term91415, term91415.getClass(), "loginBonusLv", 1827829669);
        setField(term91413, term91413.getClass(), "user", term91415);
        setLongField(term91413, term91413.getClass(), "pandoraFlagList0", -6261257793045898313L);
        setLongField(term91413, term91413.getClass(), "pandoraFlagList1", 6383832776430121737L);
        setLongField(term91413, term91413.getClass(), "pandoraFlagList2", 3853743792832767733L);
        setLongField(term91413, term91413.getClass(), "pandoraFlagList3", -6064923943154213519L);
        setLongField(term91413, term91413.getClass(), "pandoraFlagList4", -6344058468200613078L);
        setLongField(term91413, term91413.getClass(), "pandoraFlagList5", 9069301103965727560L);
        setLongField(term91413, term91413.getClass(), "pandoraFlagList6", 1078204819466025938L);
        setLongField(term91413, term91413.getClass(), "emblemFlagList", -4526944004625263747L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPandoraFlagList6", argTypes, term91413, args);
    }

};


