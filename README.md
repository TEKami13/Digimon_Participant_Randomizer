# Digimon_Participant_Randomizer
Java program to randomize participants based on a .txt file and delegates them with some restricitions.

You only need to fill out the Participants.txt with Participant's id, then the name and lastly, the ids of the other participants who they can't face
against in the group written as the id of the participant then if one more limitation is needed add a "," immediatly without space and write the id of 
the other participant. 
This version of the program have some limitations and there are some actual limitations on the whole thing, the actual limitations is 
when there are too many participants with limitations on who they can be in the same group as, the more limitations the bigger the chances of failure.
the limitations of the program is that it might be unable to add a participant to a group if every group has a participant that they can't be with; 
the program will try (a little too many times) and then send an error message, but as long as it's possible to group everyone up without any limitations 
crossing it should work after a couple tries.
