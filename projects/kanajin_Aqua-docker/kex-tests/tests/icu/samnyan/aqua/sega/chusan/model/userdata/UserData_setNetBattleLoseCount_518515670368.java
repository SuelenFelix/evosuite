package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setNetBattleLoseCount_518515670368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289992;
     Object term290069;

    public UserData_setNetBattleLoseCount_518515670368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289992 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289992, term289992.getClass(), "id", 0L);
        setField(term289992, term289992.getClass(), "card", null);
        setField(term289992, term289992.getClass(), "userName", null);
        setIntField(term289992, term289992.getClass(), "level", 0);
        setIntField(term289992, term289992.getClass(), "reincarnationNum", 0);
        setField(term289992, term289992.getClass(), "exp", null);
        setLongField(term289992, term289992.getClass(), "point", 0L);
        setLongField(term289992, term289992.getClass(), "totalPoint", 0L);
        setIntField(term289992, term289992.getClass(), "playCount", 0);
        setIntField(term289992, term289992.getClass(), "multiPlayCount", 0);
        setIntField(term289992, term289992.getClass(), "playerRating", 0);
        setIntField(term289992, term289992.getClass(), "highestRating", 0);
        setIntField(term289992, term289992.getClass(), "nameplateId", 0);
        setIntField(term289992, term289992.getClass(), "frameId", 0);
        setIntField(term289992, term289992.getClass(), "characterId", 0);
        setIntField(term289992, term289992.getClass(), "trophyId", 0);
        setIntField(term289992, term289992.getClass(), "playedTutorialBit", 0);
        setIntField(term289992, term289992.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289992, term289992.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289992, term289992.getClass(), "totalMapNum", 0);
        setLongField(term289992, term289992.getClass(), "totalHiScore", 0L);
        setLongField(term289992, term289992.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289992, term289992.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289992, term289992.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289992, term289992.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289992, term289992.getClass(), "totalUltimaHighScore", 0L);
        setField(term289992, term289992.getClass(), "eventWatchedDate", null);
        setIntField(term289992, term289992.getClass(), "friendCount", 0);
        setField(term289992, term289992.getClass(), "firstGameId", null);
        setField(term289992, term289992.getClass(), "firstRomVersion", null);
        setField(term289992, term289992.getClass(), "firstDataVersion", null);
        setField(term289992, term289992.getClass(), "firstPlayDate", null);
        setField(term289992, term289992.getClass(), "lastGameId", null);
        setField(term289992, term289992.getClass(), "lastRomVersion", null);
        setField(term289992, term289992.getClass(), "lastDataVersion", null);
        setField(term289992, term289992.getClass(), "lastLoginDate", null);
        setField(term289992, term289992.getClass(), "lastPlayDate", null);
        setIntField(term289992, term289992.getClass(), "lastPlaceId", 0);
        setField(term289992, term289992.getClass(), "lastPlaceName", null);
        setField(term289992, term289992.getClass(), "lastRegionId", null);
        setField(term289992, term289992.getClass(), "lastRegionName", null);
        setField(term289992, term289992.getClass(), "lastAllNetId", null);
        setField(term289992, term289992.getClass(), "lastClientId", null);
        setField(term289992, term289992.getClass(), "lastCountryCode", null);
        setField(term289992, term289992.getClass(), "userNameEx", null);
        setField(term289992, term289992.getClass(), "compatibleCmVersion", null);
        setIntField(term289992, term289992.getClass(), "medal", 0);
        setIntField(term289992, term289992.getClass(), "mapIconId", 0);
        setIntField(term289992, term289992.getClass(), "voiceId", 0);
        setIntField(term289992, term289992.getClass(), "avatarWear", 0);
        setIntField(term289992, term289992.getClass(), "avatarHead", 0);
        setIntField(term289992, term289992.getClass(), "avatarFace", 0);
        setIntField(term289992, term289992.getClass(), "avatarSkin", 0);
        setIntField(term289992, term289992.getClass(), "avatarItem", 0);
        setIntField(term289992, term289992.getClass(), "avatarFront", 0);
        setIntField(term289992, term289992.getClass(), "avatarBack", 0);
        setIntField(term289992, term289992.getClass(), "classEmblemBase", 0);
        setIntField(term289992, term289992.getClass(), "classEmblemMedal", 0);
        setIntField(term289992, term289992.getClass(), "stockedGridCount", 0);
        setIntField(term289992, term289992.getClass(), "exMapLoopCount", 0);
        setIntField(term289992, term289992.getClass(), "netBattlePlayCount", 0);
        setIntField(term289992, term289992.getClass(), "netBattleWinCount", 0);
        setIntField(term289992, term289992.getClass(), "netBattleLoseCount", 0);
        setIntField(term289992, term289992.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289992, term289992.getClass(), "charaIllustId", 0);
        setIntField(term289992, term289992.getClass(), "skillId", 0);
        setIntField(term289992, term289992.getClass(), "overPowerPoint", 0);
        setIntField(term289992, term289992.getClass(), "overPowerRate", 0);
        setIntField(term289992, term289992.getClass(), "overPowerLowerRank", 0);
        setIntField(term289992, term289992.getClass(), "avatarPoint", 0);
        setIntField(term289992, term289992.getClass(), "battleRankId", 0);
        setIntField(term289992, term289992.getClass(), "battleRankPoint", 0);
        setIntField(term289992, term289992.getClass(), "eliteRankPoint", 0);
        setIntField(term289992, term289992.getClass(), "netBattle1stCount", 0);
        setIntField(term289992, term289992.getClass(), "netBattle2ndCount", 0);
        setIntField(term289992, term289992.getClass(), "netBattle3rdCount", 0);
        setIntField(term289992, term289992.getClass(), "netBattle4thCount", 0);
        setIntField(term289992, term289992.getClass(), "netBattleCorrection", 0);
        setIntField(term289992, term289992.getClass(), "netBattleErrCnt", 0);
        setIntField(term289992, term289992.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289992, term289992.getClass(), "battleRewardStatus", 0);
        setIntField(term289992, term289992.getClass(), "battleRewardIndex", 0);
        setIntField(term289992, term289992.getClass(), "battleRewardCount", 0);
        setIntField(term289992, term289992.getClass(), "ext1", 0);
        setIntField(term289992, term289992.getClass(), "ext2", 0);
        setIntField(term289992, term289992.getClass(), "ext3", 0);
        setIntField(term289992, term289992.getClass(), "ext4", 0);
        setIntField(term289992, term289992.getClass(), "ext5", 0);
        setIntField(term289992, term289992.getClass(), "ext6", 0);
        setIntField(term289992, term289992.getClass(), "ext7", 0);
        setIntField(term289992, term289992.getClass(), "ext8", 0);
        setIntField(term289992, term289992.getClass(), "ext9", 0);
        setIntField(term289992, term289992.getClass(), "ext10", 0);
        setField(term289992, term289992.getClass(), "extStr1", null);
        setField(term289992, term289992.getClass(), "extStr2", null);
        setLongField(term289992, term289992.getClass(), "extLong1", 0L);
        setLongField(term289992, term289992.getClass(), "extLong2", 0L);
        setField(term289992, term289992.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289992, term289992.getClass(), "isNetBattleHost", false);
        setIntField(term289992, term289992.getClass(), "netBattleEndState", 0);
        term290069 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290069;
        callMethod(klass, "setNetBattleLoseCount", argTypes, term289992, args);
    }

};


