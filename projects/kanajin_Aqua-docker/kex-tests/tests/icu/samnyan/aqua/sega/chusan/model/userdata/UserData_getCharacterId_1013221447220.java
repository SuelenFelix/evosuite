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

public class UserData_getCharacterId_1013221447220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278514;

    public UserData_getCharacterId_1013221447220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278514 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term278514, term278514.getClass(), "id", 0L);
        setField(term278514, term278514.getClass(), "card", null);
        setField(term278514, term278514.getClass(), "userName", null);
        setIntField(term278514, term278514.getClass(), "level", 0);
        setIntField(term278514, term278514.getClass(), "reincarnationNum", 0);
        setField(term278514, term278514.getClass(), "exp", null);
        setLongField(term278514, term278514.getClass(), "point", 0L);
        setLongField(term278514, term278514.getClass(), "totalPoint", 0L);
        setIntField(term278514, term278514.getClass(), "playCount", 0);
        setIntField(term278514, term278514.getClass(), "multiPlayCount", 0);
        setIntField(term278514, term278514.getClass(), "playerRating", 0);
        setIntField(term278514, term278514.getClass(), "highestRating", 0);
        setIntField(term278514, term278514.getClass(), "nameplateId", 0);
        setIntField(term278514, term278514.getClass(), "frameId", 0);
        setIntField(term278514, term278514.getClass(), "characterId", 0);
        setIntField(term278514, term278514.getClass(), "trophyId", 0);
        setIntField(term278514, term278514.getClass(), "playedTutorialBit", 0);
        setIntField(term278514, term278514.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term278514, term278514.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term278514, term278514.getClass(), "totalMapNum", 0);
        setLongField(term278514, term278514.getClass(), "totalHiScore", 0L);
        setLongField(term278514, term278514.getClass(), "totalBasicHighScore", 0L);
        setLongField(term278514, term278514.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term278514, term278514.getClass(), "totalExpertHighScore", 0L);
        setLongField(term278514, term278514.getClass(), "totalMasterHighScore", 0L);
        setLongField(term278514, term278514.getClass(), "totalUltimaHighScore", 0L);
        setField(term278514, term278514.getClass(), "eventWatchedDate", null);
        setIntField(term278514, term278514.getClass(), "friendCount", 0);
        setField(term278514, term278514.getClass(), "firstGameId", null);
        setField(term278514, term278514.getClass(), "firstRomVersion", null);
        setField(term278514, term278514.getClass(), "firstDataVersion", null);
        setField(term278514, term278514.getClass(), "firstPlayDate", null);
        setField(term278514, term278514.getClass(), "lastGameId", null);
        setField(term278514, term278514.getClass(), "lastRomVersion", null);
        setField(term278514, term278514.getClass(), "lastDataVersion", null);
        setField(term278514, term278514.getClass(), "lastLoginDate", null);
        setField(term278514, term278514.getClass(), "lastPlayDate", null);
        setIntField(term278514, term278514.getClass(), "lastPlaceId", 0);
        setField(term278514, term278514.getClass(), "lastPlaceName", null);
        setField(term278514, term278514.getClass(), "lastRegionId", null);
        setField(term278514, term278514.getClass(), "lastRegionName", null);
        setField(term278514, term278514.getClass(), "lastAllNetId", null);
        setField(term278514, term278514.getClass(), "lastClientId", null);
        setField(term278514, term278514.getClass(), "lastCountryCode", null);
        setField(term278514, term278514.getClass(), "userNameEx", null);
        setField(term278514, term278514.getClass(), "compatibleCmVersion", null);
        setIntField(term278514, term278514.getClass(), "medal", 0);
        setIntField(term278514, term278514.getClass(), "mapIconId", 0);
        setIntField(term278514, term278514.getClass(), "voiceId", 0);
        setIntField(term278514, term278514.getClass(), "avatarWear", 0);
        setIntField(term278514, term278514.getClass(), "avatarHead", 0);
        setIntField(term278514, term278514.getClass(), "avatarFace", 0);
        setIntField(term278514, term278514.getClass(), "avatarSkin", 0);
        setIntField(term278514, term278514.getClass(), "avatarItem", 0);
        setIntField(term278514, term278514.getClass(), "avatarFront", 0);
        setIntField(term278514, term278514.getClass(), "avatarBack", 0);
        setIntField(term278514, term278514.getClass(), "classEmblemBase", 0);
        setIntField(term278514, term278514.getClass(), "classEmblemMedal", 0);
        setIntField(term278514, term278514.getClass(), "stockedGridCount", 0);
        setIntField(term278514, term278514.getClass(), "exMapLoopCount", 0);
        setIntField(term278514, term278514.getClass(), "netBattlePlayCount", 0);
        setIntField(term278514, term278514.getClass(), "netBattleWinCount", 0);
        setIntField(term278514, term278514.getClass(), "netBattleLoseCount", 0);
        setIntField(term278514, term278514.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term278514, term278514.getClass(), "charaIllustId", 0);
        setIntField(term278514, term278514.getClass(), "skillId", 0);
        setIntField(term278514, term278514.getClass(), "overPowerPoint", 0);
        setIntField(term278514, term278514.getClass(), "overPowerRate", 0);
        setIntField(term278514, term278514.getClass(), "overPowerLowerRank", 0);
        setIntField(term278514, term278514.getClass(), "avatarPoint", 0);
        setIntField(term278514, term278514.getClass(), "battleRankId", 0);
        setIntField(term278514, term278514.getClass(), "battleRankPoint", 0);
        setIntField(term278514, term278514.getClass(), "eliteRankPoint", 0);
        setIntField(term278514, term278514.getClass(), "netBattle1stCount", 0);
        setIntField(term278514, term278514.getClass(), "netBattle2ndCount", 0);
        setIntField(term278514, term278514.getClass(), "netBattle3rdCount", 0);
        setIntField(term278514, term278514.getClass(), "netBattle4thCount", 0);
        setIntField(term278514, term278514.getClass(), "netBattleCorrection", 0);
        setIntField(term278514, term278514.getClass(), "netBattleErrCnt", 0);
        setIntField(term278514, term278514.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term278514, term278514.getClass(), "battleRewardStatus", 0);
        setIntField(term278514, term278514.getClass(), "battleRewardIndex", 0);
        setIntField(term278514, term278514.getClass(), "battleRewardCount", 0);
        setIntField(term278514, term278514.getClass(), "ext1", 0);
        setIntField(term278514, term278514.getClass(), "ext2", 0);
        setIntField(term278514, term278514.getClass(), "ext3", 0);
        setIntField(term278514, term278514.getClass(), "ext4", 0);
        setIntField(term278514, term278514.getClass(), "ext5", 0);
        setIntField(term278514, term278514.getClass(), "ext6", 0);
        setIntField(term278514, term278514.getClass(), "ext7", 0);
        setIntField(term278514, term278514.getClass(), "ext8", 0);
        setIntField(term278514, term278514.getClass(), "ext9", 0);
        setIntField(term278514, term278514.getClass(), "ext10", 0);
        setField(term278514, term278514.getClass(), "extStr1", null);
        setField(term278514, term278514.getClass(), "extStr2", null);
        setLongField(term278514, term278514.getClass(), "extLong1", 0L);
        setLongField(term278514, term278514.getClass(), "extLong2", 0L);
        setField(term278514, term278514.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term278514, term278514.getClass(), "isNetBattleHost", false);
        setIntField(term278514, term278514.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term278514, args);
    }

};


