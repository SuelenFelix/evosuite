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

public class UserData_setCompatibleCmVersion_2075786338351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288651;

    public UserData_setCompatibleCmVersion_2075786338351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288651 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term288651, term288651.getClass(), "id", 0L);
        setField(term288651, term288651.getClass(), "card", null);
        setField(term288651, term288651.getClass(), "userName", null);
        setIntField(term288651, term288651.getClass(), "level", 0);
        setIntField(term288651, term288651.getClass(), "reincarnationNum", 0);
        setField(term288651, term288651.getClass(), "exp", null);
        setLongField(term288651, term288651.getClass(), "point", 0L);
        setLongField(term288651, term288651.getClass(), "totalPoint", 0L);
        setIntField(term288651, term288651.getClass(), "playCount", 0);
        setIntField(term288651, term288651.getClass(), "multiPlayCount", 0);
        setIntField(term288651, term288651.getClass(), "playerRating", 0);
        setIntField(term288651, term288651.getClass(), "highestRating", 0);
        setIntField(term288651, term288651.getClass(), "nameplateId", 0);
        setIntField(term288651, term288651.getClass(), "frameId", 0);
        setIntField(term288651, term288651.getClass(), "characterId", 0);
        setIntField(term288651, term288651.getClass(), "trophyId", 0);
        setIntField(term288651, term288651.getClass(), "playedTutorialBit", 0);
        setIntField(term288651, term288651.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term288651, term288651.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term288651, term288651.getClass(), "totalMapNum", 0);
        setLongField(term288651, term288651.getClass(), "totalHiScore", 0L);
        setLongField(term288651, term288651.getClass(), "totalBasicHighScore", 0L);
        setLongField(term288651, term288651.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term288651, term288651.getClass(), "totalExpertHighScore", 0L);
        setLongField(term288651, term288651.getClass(), "totalMasterHighScore", 0L);
        setLongField(term288651, term288651.getClass(), "totalUltimaHighScore", 0L);
        setField(term288651, term288651.getClass(), "eventWatchedDate", null);
        setIntField(term288651, term288651.getClass(), "friendCount", 0);
        setField(term288651, term288651.getClass(), "firstGameId", null);
        setField(term288651, term288651.getClass(), "firstRomVersion", null);
        setField(term288651, term288651.getClass(), "firstDataVersion", null);
        setField(term288651, term288651.getClass(), "firstPlayDate", null);
        setField(term288651, term288651.getClass(), "lastGameId", null);
        setField(term288651, term288651.getClass(), "lastRomVersion", null);
        setField(term288651, term288651.getClass(), "lastDataVersion", null);
        setField(term288651, term288651.getClass(), "lastLoginDate", null);
        setField(term288651, term288651.getClass(), "lastPlayDate", null);
        setIntField(term288651, term288651.getClass(), "lastPlaceId", 0);
        setField(term288651, term288651.getClass(), "lastPlaceName", null);
        setField(term288651, term288651.getClass(), "lastRegionId", null);
        setField(term288651, term288651.getClass(), "lastRegionName", null);
        setField(term288651, term288651.getClass(), "lastAllNetId", null);
        setField(term288651, term288651.getClass(), "lastClientId", null);
        setField(term288651, term288651.getClass(), "lastCountryCode", null);
        setField(term288651, term288651.getClass(), "userNameEx", null);
        setField(term288651, term288651.getClass(), "compatibleCmVersion", null);
        setIntField(term288651, term288651.getClass(), "medal", 0);
        setIntField(term288651, term288651.getClass(), "mapIconId", 0);
        setIntField(term288651, term288651.getClass(), "voiceId", 0);
        setIntField(term288651, term288651.getClass(), "avatarWear", 0);
        setIntField(term288651, term288651.getClass(), "avatarHead", 0);
        setIntField(term288651, term288651.getClass(), "avatarFace", 0);
        setIntField(term288651, term288651.getClass(), "avatarSkin", 0);
        setIntField(term288651, term288651.getClass(), "avatarItem", 0);
        setIntField(term288651, term288651.getClass(), "avatarFront", 0);
        setIntField(term288651, term288651.getClass(), "avatarBack", 0);
        setIntField(term288651, term288651.getClass(), "classEmblemBase", 0);
        setIntField(term288651, term288651.getClass(), "classEmblemMedal", 0);
        setIntField(term288651, term288651.getClass(), "stockedGridCount", 0);
        setIntField(term288651, term288651.getClass(), "exMapLoopCount", 0);
        setIntField(term288651, term288651.getClass(), "netBattlePlayCount", 0);
        setIntField(term288651, term288651.getClass(), "netBattleWinCount", 0);
        setIntField(term288651, term288651.getClass(), "netBattleLoseCount", 0);
        setIntField(term288651, term288651.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term288651, term288651.getClass(), "charaIllustId", 0);
        setIntField(term288651, term288651.getClass(), "skillId", 0);
        setIntField(term288651, term288651.getClass(), "overPowerPoint", 0);
        setIntField(term288651, term288651.getClass(), "overPowerRate", 0);
        setIntField(term288651, term288651.getClass(), "overPowerLowerRank", 0);
        setIntField(term288651, term288651.getClass(), "avatarPoint", 0);
        setIntField(term288651, term288651.getClass(), "battleRankId", 0);
        setIntField(term288651, term288651.getClass(), "battleRankPoint", 0);
        setIntField(term288651, term288651.getClass(), "eliteRankPoint", 0);
        setIntField(term288651, term288651.getClass(), "netBattle1stCount", 0);
        setIntField(term288651, term288651.getClass(), "netBattle2ndCount", 0);
        setIntField(term288651, term288651.getClass(), "netBattle3rdCount", 0);
        setIntField(term288651, term288651.getClass(), "netBattle4thCount", 0);
        setIntField(term288651, term288651.getClass(), "netBattleCorrection", 0);
        setIntField(term288651, term288651.getClass(), "netBattleErrCnt", 0);
        setIntField(term288651, term288651.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term288651, term288651.getClass(), "battleRewardStatus", 0);
        setIntField(term288651, term288651.getClass(), "battleRewardIndex", 0);
        setIntField(term288651, term288651.getClass(), "battleRewardCount", 0);
        setIntField(term288651, term288651.getClass(), "ext1", 0);
        setIntField(term288651, term288651.getClass(), "ext2", 0);
        setIntField(term288651, term288651.getClass(), "ext3", 0);
        setIntField(term288651, term288651.getClass(), "ext4", 0);
        setIntField(term288651, term288651.getClass(), "ext5", 0);
        setIntField(term288651, term288651.getClass(), "ext6", 0);
        setIntField(term288651, term288651.getClass(), "ext7", 0);
        setIntField(term288651, term288651.getClass(), "ext8", 0);
        setIntField(term288651, term288651.getClass(), "ext9", 0);
        setIntField(term288651, term288651.getClass(), "ext10", 0);
        setField(term288651, term288651.getClass(), "extStr1", null);
        setField(term288651, term288651.getClass(), "extStr2", null);
        setLongField(term288651, term288651.getClass(), "extLong1", 0L);
        setLongField(term288651, term288651.getClass(), "extLong2", 0L);
        setField(term288651, term288651.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term288651, term288651.getClass(), "isNetBattleHost", false);
        setIntField(term288651, term288651.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCompatibleCmVersion", argTypes, term288651, args);
    }

};


