### Functional requirements 
1. The `system` shall notify the user when a new weekly `workout report`<sup>1</sup> is available.
2. The `system` shall allow to add a personalized note when assigning a `workout routine`<sup>2</sup>.
3. The `system` shall allow the creation of new `access credentials` <sup>3</sup>  for new `users` and `trainers`.
4. The `system` shall store all the `users’` `workout routines`.
5. The `system` shall provide the creation of new `workout routines`.
6. The `system` shall allow to mark as `skipped`<sup>4</sup> exercises or sets of a workout routine.
7. The system shall provide this 3 types of membership:
- 1 month for 50 $ and grants 100 points
- 3 months for 120 $ and grants 350 points
- 12 months for 400 $ and grants 1500
8. The system shall provide this number of point every time someone registers to the gym for the first time with a referral code of another gym member:
- 1 month membership = 100 points for both
- 3 months membership = 200 point for both
- 12 months membership = 300 points for both

9. The system shall provide the possibility to use the points in the following ways:
- 3000 points for 1 month of membership for free
- 6000 points for 3 months of membership for free
- 12000 points for 12 months of membership for free



### Dictionary

>  
> 1.  **Workout report** : Using the data from workout routines such reps done for an exercise,weights used, skipped$^{(4)}$ exercise,workouts done during the week, time spent exercising, ecc (==da aggiungere o togliere elementi cambiati per la docuemntazione finale==)
> 2. **Workout routine**: Its composed by a variable number of exercises and each one of them has a variable number of reps to be done, each exercise needs to have a weight target to use.
> 3. **Access credentials** : we have different types of credentials, one for the receptions that is created by signing up to the service has a gym, and we have a type for users of the gym and trainers that is created by the reception, the access system is the same for everyone but the interface changes for each level of user
> 4. **Skipped**: You can register a exercise/training/rep as skipped for whatever reason, this is useful when you want to keep track of what you have to recover/focus and to keep the trainer informed on how your training is going.