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

public class UserData_setLastClientId_443293048348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288420;

    public UserData_setLastClientId_443293048348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288420 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term288420, term288420.getClass(), "id", 0L);
        setField(term288420, term288420.getClass(), "card", null);
        setField(term288420, term288420.getClass(), "userName", null);
        setIntField(term288420, term288420.getClass(), "level", 0);
        setIntField(term288420, term288420.getClass(), "reincarnationNum", 0);
        setField(term288420, term288420.getClass(), "exp", null);
        setLongField(term288420, term288420.getClass(), "point", 0L);
        setLongField(term288420, term288420.getClass(), "totalPoint", 0L);
        setIntField(term288420, term288420.getClass(), "playCount", 0);
        setIntField(term288420, term288420.getClass(), "multiPlayCount", 0);
        setIntField(term288420, term288420.getClass(), "playerRating", 0);
        setIntField(term288420, term288420.getClass(), "highestRating", 0);
        setIntField(term288420, term288420.getClass(), "nameplateId", 0);
        setIntField(term288420, term288420.getClass(), "frameId", 0);
        setIntField(term288420, term288420.getClass(), "characterId", 0);
        setIntField(term288420, term288420.getClass(), "trophyId", 0);
        setIntField(term288420, term288420.getClass(), "playedTutorialBit", 0);
        setIntField(term288420, term288420.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term288420, term288420.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term288420, term288420.getClass(), "totalMapNum", 0);
        setLongField(term288420, term288420.getClass(), "totalHiScore", 0L);
        setLongField(term288420, term288420.getClass(), "totalBasicHighScore", 0L);
        setLongField(term288420, term288420.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term288420, term288420.getClass(), "totalExpertHighScore", 0L);
        setLongField(term288420, term288420.getClass(), "totalMasterHighScore", 0L);
        setLongField(term288420, term288420.getClass(), "totalUltimaHighScore", 0L);
        setField(term288420, term288420.getClass(), "eventWatchedDate", null);
        setIntField(term288420, term288420.getClass(), "friendCount", 0);
        setField(term288420, term288420.getClass(), "firstGameId", null);
        setField(term288420, term288420.getClass(), "firstRomVersion", null);
        setField(term288420, term288420.getClass(), "firstDataVersion", null);
        setField(term288420, term288420.getClass(), "firstPlayDate", null);
        setField(term288420, term288420.getClass(), "lastGameId", null);
        setField(term288420, term288420.getClass(), "lastRomVersion", null);
        setField(term288420, term288420.getClass(), "lastDataVersion", null);
        setField(term288420, term288420.getClass(), "lastLoginDate", null);
        setField(term288420, term288420.getClass(), "lastPlayDate", null);
        setIntField(term288420, term288420.getClass(), "lastPlaceId", 0);
        setField(term288420, term288420.getClass(), "lastPlaceName", null);
        setField(term288420, term288420.getClass(), "lastRegionId", null);
        setField(term288420, term288420.getClass(), "lastRegionName", null);
        setField(term288420, term288420.getClass(), "lastAllNetId", null);
        setField(term288420, term288420.getClass(), "lastClientId", null);
        setField(term288420, term288420.getClass(), "lastCountryCode", null);
        setField(term288420, term288420.getClass(), "userNameEx", null);
        setField(term288420, term288420.getClass(), "compatibleCmVersion", null);
        setIntField(term288420, term288420.getClass(), "medal", 0);
        setIntField(term288420, term288420.getClass(), "mapIconId", 0);
        setIntField(term288420, term288420.getClass(), "voiceId", 0);
        setIntField(term288420, term288420.getClass(), "avatarWear", 0);
        setIntField(term288420, term288420.getClass(), "avatarHead", 0);
        setIntField(term288420, term288420.getClass(), "avatarFace", 0);
        setIntField(term288420, term288420.getClass(), "avatarSkin", 0);
        setIntField(term288420, term288420.getClass(), "avatarItem", 0);
        setIntField(term288420, term288420.getClass(), "avatarFront", 0);
        setIntField(term288420, term288420.getClass(), "avatarBack", 0);
        setIntField(term288420, term288420.getClass(), "classEmblemBase", 0);
        setIntField(term288420, term288420.getClass(), "classEmblemMedal", 0);
        setIntField(term288420, term288420.getClass(), "stockedGridCount", 0);
        setIntField(term288420, term288420.getClass(), "exMapLoopCount", 0);
        setIntField(term288420, term288420.getClass(), "netBattlePlayCount", 0);
        setIntField(term288420, term288420.getClass(), "netBattleWinCount", 0);
        setIntField(term288420, term288420.getClass(), "netBattleLoseCount", 0);
        setIntField(term288420, term288420.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term288420, term288420.getClass(), "charaIllustId", 0);
        setIntField(term288420, term288420.getClass(), "skillId", 0);
        setIntField(term288420, term288420.getClass(), "overPowerPoint", 0);
        setIntField(term288420, term288420.getClass(), "overPowerRate", 0);
        setIntField(term288420, term288420.getClass(), "overPowerLowerRank", 0);
        setIntField(term288420, term288420.getClass(), "avatarPoint", 0);
        setIntField(term288420, term288420.getClass(), "battleRankId", 0);
        setIntField(term288420, term288420.getClass(), "battleRankPoint", 0);
        setIntField(term288420, term288420.getClass(), "eliteRankPoint", 0);
        setIntField(term288420, term288420.getClass(), "netBattle1stCount", 0);
        setIntField(term288420, term288420.getClass(), "netBattle2ndCount", 0);
        setIntField(term288420, term288420.getClass(), "netBattle3rdCount", 0);
        setIntField(term288420, term288420.getClass(), "netBattle4thCount", 0);
        setIntField(term288420, term288420.getClass(), "netBattleCorrection", 0);
        setIntField(term288420, term288420.getClass(), "netBattleErrCnt", 0);
        setIntField(term288420, term288420.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term288420, term288420.getClass(), "battleRewardStatus", 0);
        setIntField(term288420, term288420.getClass(), "battleRewardIndex", 0);
        setIntField(term288420, term288420.getClass(), "battleRewardCount", 0);
        setIntField(term288420, term288420.getClass(), "ext1", 0);
        setIntField(term288420, term288420.getClass(), "ext2", 0);
        setIntField(term288420, term288420.getClass(), "ext3", 0);
        setIntField(term288420, term288420.getClass(), "ext4", 0);
        setIntField(term288420, term288420.getClass(), "ext5", 0);
        setIntField(term288420, term288420.getClass(), "ext6", 0);
        setIntField(term288420, term288420.getClass(), "ext7", 0);
        setIntField(term288420, term288420.getClass(), "ext8", 0);
        setIntField(term288420, term288420.getClass(), "ext9", 0);
        setIntField(term288420, term288420.getClass(), "ext10", 0);
        setField(term288420, term288420.getClass(), "extStr1", null);
        setField(term288420, term288420.getClass(), "extStr2", null);
        setLongField(term288420, term288420.getClass(), "extLong1", 0L);
        setLongField(term288420, term288420.getClass(), "extLong2", 0L);
        setField(term288420, term288420.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term288420, term288420.getClass(), "isNetBattleHost", false);
        setIntField(term288420, term288420.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastClientId", argTypes, term288420, args);
    }

};


