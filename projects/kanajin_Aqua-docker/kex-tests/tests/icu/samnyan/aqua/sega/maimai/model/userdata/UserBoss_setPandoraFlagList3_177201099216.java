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

public class UserBoss_setPandoraFlagList3_177201099216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93603;
     Object term93787;

    public UserBoss_setPandoraFlagList3_177201099216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term93609 = new Long(4689907154423223972L);
        term93603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term93605 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term93607 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term93623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93628 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93638 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term93603, term93603.getClass(), "id", 1342629750107593698L);
        setLongField(term93605, term93605.getClass(), "id", -2050224942342343039L);
        setLongField(term93607, term93607.getClass(), "id", -2456427474561523240L);
        setField(term93607, term93607.getClass(), "extId", term93609);
        setField(term93607, term93607.getClass(), "luid", "VckRXyiShh");
        setIntField(term93624, term93624.getClass(), "year", 2022);
        setShortField(term93624, term93624.getClass(), "month", (short) 10);
        setShortField(term93624, term93624.getClass(), "day", (short) 1);
        setField(term93623, term93623.getClass(), "date", term93624);
        setByteField(term93628, term93628.getClass(), "hour", (byte) 0);
        setByteField(term93628, term93628.getClass(), "minute", (byte) 56);
        setByteField(term93628, term93628.getClass(), "second", (byte) 38);
        setIntField(term93628, term93628.getClass(), "nano", 320635849);
        setField(term93623, term93623.getClass(), "time", term93628);
        setField(term93607, term93607.getClass(), "registerTime", term93623);
        setIntField(term93634, term93634.getClass(), "year", 2028);
        setShortField(term93634, term93634.getClass(), "month", (short) 4);
        setShortField(term93634, term93634.getClass(), "day", (short) 9);
        setField(term93633, term93633.getClass(), "date", term93634);
        setByteField(term93638, term93638.getClass(), "hour", (byte) 15);
        setByteField(term93638, term93638.getClass(), "minute", (byte) 32);
        setByteField(term93638, term93638.getClass(), "second", (byte) 25);
        setIntField(term93638, term93638.getClass(), "nano", 604005925);
        setField(term93633, term93633.getClass(), "time", term93638);
        setField(term93607, term93607.getClass(), "accessTime", term93633);
        setField(term93605, term93605.getClass(), "card", term93607);
        setIntField(term93605, term93605.getClass(), "lastDataVersion", -1645647552);
        setField(term93605, term93605.getClass(), "userName", "ZKwDTklKHb");
        setIntField(term93605, term93605.getClass(), "point", 1876056340);
        setIntField(term93605, term93605.getClass(), "totalPoint", -114566575);
        setIntField(term93605, term93605.getClass(), "iconId", -415161512);
        setIntField(term93605, term93605.getClass(), "nameplateId", -638764759);
        setIntField(term93605, term93605.getClass(), "frameId", -1643368171);
        setIntField(term93605, term93605.getClass(), "trophyId", 1904125756);
        setIntField(term93605, term93605.getClass(), "playCount", -174814025);
        setIntField(term93605, term93605.getClass(), "playVsCount", 958303322);
        setIntField(term93605, term93605.getClass(), "playSyncCount", 1228479658);
        setIntField(term93605, term93605.getClass(), "winCount", 129520433);
        setIntField(term93605, term93605.getClass(), "helpCount", 390437953);
        setIntField(term93605, term93605.getClass(), "comboCount", -1928220499);
        setIntField(term93605, term93605.getClass(), "feverCount", 1701541391);
        setIntField(term93605, term93605.getClass(), "totalHiScore", -936192688);
        setIntField(term93605, term93605.getClass(), "totalEasyHighScore", 938944057);
        setIntField(term93605, term93605.getClass(), "totalBasicHighScore", 855364273);
        setIntField(term93605, term93605.getClass(), "totalAdvancedHighScore", -519539376);
        setIntField(term93605, term93605.getClass(), "totalExpertHighScore", -651264831);
        setIntField(term93605, term93605.getClass(), "totalMasterHighScore", 801845409);
        setIntField(term93605, term93605.getClass(), "totalReMasterHighScore", -638292583);
        setIntField(term93605, term93605.getClass(), "totalHighSync", -1507192014);
        setIntField(term93605, term93605.getClass(), "totalEasySync", -444046395);
        setIntField(term93605, term93605.getClass(), "totalBasicSync", -1931089223);
        setIntField(term93605, term93605.getClass(), "totalAdvancedSync", -1614199178);
        setIntField(term93605, term93605.getClass(), "totalExpertSync", 8500819);
        setIntField(term93605, term93605.getClass(), "totalMasterSync", -84115449);
        setIntField(term93605, term93605.getClass(), "totalReMasterSync", 1974081733);
        setIntField(term93605, term93605.getClass(), "playerRating", -29727064);
        setIntField(term93605, term93605.getClass(), "highestRating", -36303217);
        setIntField(term93605, term93605.getClass(), "rankAuthTailId", -1425546184);
        setField(term93605, term93605.getClass(), "eventWatchedDate", "tQMlnMStsQ");
        setField(term93605, term93605.getClass(), "webLimitDate", "OYJvKAMFEk");
        setIntField(term93605, term93605.getClass(), "challengeTrackPhase", -1133905901);
        setIntField(term93605, term93605.getClass(), "firstPlayBits", -975779438);
        setField(term93605, term93605.getClass(), "lastPlayDate", "puNAveVBkA");
        setIntField(term93605, term93605.getClass(), "lastPlaceId", -1141325147);
        setField(term93605, term93605.getClass(), "lastPlaceName", "BcZKUIbuQL");
        setIntField(term93605, term93605.getClass(), "lastRegionId", 1102382810);
        setField(term93605, term93605.getClass(), "lastRegionName", "YvjPnZyRnw");
        setField(term93605, term93605.getClass(), "lastClientId", "IKmMfqFPku");
        setField(term93605, term93605.getClass(), "lastCountryCode", "NACnGDmVPl");
        setIntField(term93605, term93605.getClass(), "eventPoint", -546054340);
        setIntField(term93605, term93605.getClass(), "totalLv", 839496076);
        setIntField(term93605, term93605.getClass(), "lastLoginBonusDay", -709438438);
        setIntField(term93605, term93605.getClass(), "lastSurvivalBonusDay", -270196134);
        setIntField(term93605, term93605.getClass(), "loginBonusLv", -518906199);
        setField(term93603, term93603.getClass(), "user", term93605);
        setLongField(term93603, term93603.getClass(), "pandoraFlagList0", -7010338441819086776L);
        setLongField(term93603, term93603.getClass(), "pandoraFlagList1", 1881020230556705937L);
        setLongField(term93603, term93603.getClass(), "pandoraFlagList2", -2937192447508714837L);
        setLongField(term93603, term93603.getClass(), "pandoraFlagList3", 3804352102719959988L);
        setLongField(term93603, term93603.getClass(), "pandoraFlagList4", -5317408542996378156L);
        setLongField(term93603, term93603.getClass(), "pandoraFlagList5", 3345606904545902400L);
        setLongField(term93603, term93603.getClass(), "pandoraFlagList6", -6289397283685653555L);
        setLongField(term93603, term93603.getClass(), "emblemFlagList", 4270489998641176236L);
        term93787 = new Long(7649159120514186821L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term93787;
        callMethod(klass, "setPandoraFlagList3", argTypes, term93603, args);
    }

};


